package com.MarkusE.Backend1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
                .csrf(csrf -> csrf.disable()) // för Postman
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers(HttpMethod.GET, "/members").hasAnyRole("USER", "ADMIN")


                        .requestMatchers(HttpMethod.POST, "admin/**").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET, "admin/**").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.PUT, "admin/**").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.PATCH, "admin/**").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.DELETE, "admin/**").hasRole("ADMIN")


                        .anyRequest().authenticated()
                )
                .httpBasic(org.springframework.security.config.Customizer.withDefaults()); // Basic Auth

        return http.build();
    }
}