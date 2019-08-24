package com.hack.hcl.storedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.hack.hcl")
@EntityScan("com.hack.hcl.model")
@EnableJpaRepositories("com.hack.hcl.dao")
public class StoredemoApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(StoredemoApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(
      SpringApplicationBuilder builder) {
        return builder.sources(StoredemoApplication.class);
    }
 
   

}
