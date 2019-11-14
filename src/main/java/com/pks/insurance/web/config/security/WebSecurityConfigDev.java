package com.pks.insurance.web.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.crypto.password.LdapShaPasswordEncoder;
/**
 * This class provides spring security configuration.
 * 
 *  @EnableWebMvcSecurity provides additional feature to auto integrate the
 *  spring security with spring web mvc. Hidden _csrf token is provided automatically
 *  is disabled to make the h2 db console work.
 * 
 * @author Pankaj Soni
 *
 */
@Configuration
@EnableWebSecurity
@Profile("dev")
public class WebSecurityConfigDev extends WebSecurityConfigurerAdapter{ 
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
	        .anyRequest().fullyAuthenticated()
	        .and()
	        .formLogin();
		
		//Enable h2 db console
		http.csrf().disable();
		http.headers().frameOptions().disable();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.ldapAuthentication()
		.userDnPatterns("uid={0},ou=people")
		.groupSearchBase("ou=groups")
		.contextSource()
			.url("ldap://localhost:8389/dc=springframework,dc=org")
			.and()
		.passwordCompare()
			.passwordEncoder(new LdapShaPasswordEncoder())
			.passwordAttribute("userPassword");
	}
	
	
	

}
