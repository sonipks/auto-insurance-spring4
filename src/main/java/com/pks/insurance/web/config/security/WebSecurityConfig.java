package com.pks.insurance.web.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
/**
 * This class provides spring security configuration.
 * 
 *  @EnableWebMvcSecurity provides additional feature to auto integrate the
 *  spring security with spring web mvc. Hidden _csrf token is provided automatically.
 * 
 * @author Pankaj Soni
 *
 */
@Configuration
@EnableWebMvcSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{ 
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
	        .antMatchers("/", "/home").permitAll()
	        .anyRequest().authenticated()
	        .and()
	    .formLogin()
	        .loginPage("/login")
	        .permitAll()
	        .and()
	    .logout()
	        .permitAll();
	}
	
	@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
                .withUser("user").password("password").roles("USER");
    }
	
	

}
