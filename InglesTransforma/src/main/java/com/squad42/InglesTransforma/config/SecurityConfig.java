package com.squad42.InglesTransforma.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SecurityConfig {
	@SuppressWarnings("removal")
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http. authorizeHttpRequests().anyRequest().permitAll();
		return http.build();
	}

}
