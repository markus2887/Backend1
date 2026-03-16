package com.MarkusE.Backend1.repo;

import com.MarkusE.Backend1.entity.Member;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}
