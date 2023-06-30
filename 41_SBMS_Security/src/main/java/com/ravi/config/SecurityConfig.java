package com.ravi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Component;

@Component
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean
	public SecurityFilterChain securityFilter(HttpSecurity http) throws Exception {
		
		System.out.println("security filter called.........");
		http.authorizeHttpRequests((req)-> req.antMatchers("/hi","/contact","/swagger-ui.html").permitAll().anyRequest().authenticated()).formLogin();
		
		
		//logic....to customize security
		return http.build();
	}

}
