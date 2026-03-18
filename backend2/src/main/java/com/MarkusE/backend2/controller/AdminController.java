package com.MarkusE.Backend1.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/members")
public class AdminController {
    private final MemberServiceImpl memberServiceImpl;

    public AdminController(MemberServiceImpl memberServiceImpl) {
        this.memberServiceImpl = memberServiceImpl;
    }

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public List<MemberDto> list() {
        return memberServiceImpl.findALl();
    }

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public MemberDto get(@PathVariable Long id) {
        return memberServiceImpl.findById(id);
    }


}