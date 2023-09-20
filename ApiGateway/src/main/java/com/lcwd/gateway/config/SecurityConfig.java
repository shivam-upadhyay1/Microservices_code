package com.lcwd.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity     //new trika se hum krenge @bean bnake ab hume websecurityadapter class ko extend krne ki jrurat nhi h 
public class SecurityConfig {

	@Bean
	public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity httpSecurity)
	{
		httpSecurity
		               .authorizeExchange()      //first we authorize the request
		               .anyExchange()               //koi bhi request ho wo authenticated honi chahye
		               .authenticated()
		               .and()
		               .oauth2Client()
		               .and()
		               .oauth2ResourceServer()
		               .jwt();
		
		return httpSecurity.build();
	}
}
