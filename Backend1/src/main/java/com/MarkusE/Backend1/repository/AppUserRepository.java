package com.MarkusE.Backend1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    boolean existsByUserName(String username);
    Optional<AppUser> findByUsername(String username);
    Optional<AppUser> findByMemberId(Long memberId);
}
