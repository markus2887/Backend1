package com.MarkusE.Backend1.service;

import com.MarkusE.Backend2.entity.Address;
import com.MarkusE.Backend2.entity.Member;
import com.MarkusE.Backend2.repo.AddressRepository;
import com.MarkusE.Backend2.repo.MemberRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MemberService {

    private final MemberRepository memberRepository;
    private final AddressRepository addressRepository;

    public MemberServiceImpl(MemberRepository memberRepository, AddressRepository addressRepository) {
        this.memberRepository = memberRepository;
        this.addressRepository = addressRepository;
    }

    @PostConstruct
    public void createMembers() {
        Address address = saveAddress(new Address("Granvägen 28", "432 33", "Varberg"));
        Address addressTwo = saveAddress(new Address("Stengatan 10", "432 45", "Göteborg"));

        saveMember(new Member("Markus", "Emanuelsson", address, "markus.emanuelsson@gmail.com", "0768444036", LocalDate.of(1985, 9, 11)));
        saveMember(new Member("Adam", "Olsson", address, "adam.olsson@gmail.com", "076345323", LocalDate.of(1988, 5, 22)));
        saveMember(new Member("Kalle", "Andersson", addressTwo, "kalle.andersson@gmail.com", "073543534", LocalDate.of(1999, 12, 4)));
        saveMember(new Member("Sara", "Eliasson", addressTwo, "sara.eliasson@gmail.com", "0705345344", LocalDate.of(1987, 2, 16)));
        saveMember(new Member("Thomas", "Nilsson", addressTwo, "thomas.nilsson@gmail.com", "0734534541", LocalDate.of(1983, 6, 15)));
    }

    public Member saveMember(Member member) {
        Long addressId = member.getAddress().getId();

        Address address = addressRepository.findById(addressId)
                .orElseThrow(() -> new RuntimeException("Address not found"));

        member.setAddress(address);
        return memberRepository.save(member);
    }

    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

}