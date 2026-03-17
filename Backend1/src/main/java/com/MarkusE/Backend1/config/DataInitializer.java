package com.MarkusE.Backend1.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Role;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Set;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initData(AppUserRepository appUserRepo, PasswordEncoder passwordEncoder) {
        return -> {
            if (appUserRepo.count() == 0) {
                AppUser admin1 = new AppUser(
                        "admin1",
                        passwordEncoder.encode("admin1")
                        Set.of(Role.ADMIN)
                );

                appUserRepo.saveAll(List.of(admin1));
                System.out.println("Skapat adminkonto, PW samma som username");
            }


        }
    }


}
