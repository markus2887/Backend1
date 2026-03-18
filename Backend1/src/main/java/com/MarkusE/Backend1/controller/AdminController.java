package com.MarkusE.Backend1.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/members")
public class AdminController {

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public List<MemberDto> list() {
        return
    }

}
