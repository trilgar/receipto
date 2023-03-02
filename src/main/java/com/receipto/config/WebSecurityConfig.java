package com.receipto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig {
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        //todo JWT auth
        http
                .csrf()
                .disable()

                .authorizeHttpRequests()
                .requestMatchers("**")
                .permitAll()
                .anyRequest()
                .permitAll();

        return http.build();
    }
}
