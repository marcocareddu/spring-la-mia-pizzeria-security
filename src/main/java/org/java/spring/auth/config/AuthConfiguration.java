package org.java.spring.auth.config;

import org.java.spring.services.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class AuthConfiguration {

	@Bean
	 public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	 
		http.authorizeHttpRequests()
			.requestMatchers("/user/**").hasAnyAuthority("USER")
			.requestMatchers("/create/**").hasAnyAuthority("ADMIN")
			.requestMatchers("/admin/**").hasAnyAuthority("ADMIN")
			.requestMatchers("/edit/**").hasAnyAuthority("ADMIN")
			.requestMatchers("/god/**").hasAuthority("GOD")
			.requestMatchers("/**").permitAll()
			.and().formLogin()
			.and().logout();
			
			return http.build();
	 }
	
	 @Bean
	 UserDetailsService userDetailsService() {
	 return new UserService();
	 }
	
	 @Bean
	 public static PasswordEncoder passwordEncoder() {
	 return new BCryptPasswordEncoder();
	 }
	 
	 @Bean
	 DaoAuthenticationProvider authenticationProvider() {
	  DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
	 
	  authProvider.setUserDetailsService(userDetailsService());
	  authProvider.setPasswordEncoder(passwordEncoder());
	 
	  return authProvider;
	 }
}
