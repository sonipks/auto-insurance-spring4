package com.pks.insurance.web.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
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
@EnableWebMvcSecurity
@Profile("dev")
public class WebSecurityConfigDev extends WebSecurityConfigurerAdapter{ 
	
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity
			.authorizeRequests()
	        .antMatchers("/", "/home","/about","/contactus","/console/*").permitAll()
	        .anyRequest().authenticated()
	        .and()
	    .formLogin()
	        .loginPage("/login")
	        .permitAll()
	        .and()
	    .logout()
	        .permitAll();
		
		//Enable h2 db console
		httpSecurity.csrf().disable();
		httpSecurity.headers().frameOptions().disable();
	}
	
	@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
                .withUser("user").password("password").roles("USER");
    }
	
	

}
