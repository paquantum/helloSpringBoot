package kr.ac.hansung.cse.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
 
	//security-context.xml방식대신에 class를 이용한 security
	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http        
        	.authorizeRequests()
        		.anyRequest()
        		.permitAll()
        		.and()
            .csrf().disable();
    }
}