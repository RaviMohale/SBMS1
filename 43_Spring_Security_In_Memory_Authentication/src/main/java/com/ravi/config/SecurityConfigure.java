package com.ravi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.ravi.service.MyUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfigure {
	
	/*
	 * @Bean public InMemoryUserDetailsManager configureUser() { UserDetails
	 * adminUser = User.withDefaultPasswordEncoder() .username("Ravi")
	 * .password("ravi@123").authorities("Admin").build();
	 * 
	 * UserDetails normalUser = User.withDefaultPasswordEncoder() .username("raja")
	 * .password("raja@123").authorities("User").build();
	 * 
	 * return new InMemoryUserDetailsManager(adminUser, normalUser);
	 * 
	 * };
	 */
	
	@Autowired
	private MyUserDetailsService userDlsService;
	
	@Autowired
	public void configureUser(AuthenticationManagerBuilder auth)throws Exception{
		
		auth.userDetailsService(userDlsService)
		.passwordEncoder(NoOpPasswordEncoder.getInstance());
	}
	
	
	@Bean
	public SecurityFilterChain securityConfig(HttpSecurity http)throws Exception{
		
		http.authorizeHttpRequests((req)-> req.antMatchers("/contact")
				.permitAll()
				.anyRequest().authenticated()).formLogin();
		
		
		return http.build();
	}

}
