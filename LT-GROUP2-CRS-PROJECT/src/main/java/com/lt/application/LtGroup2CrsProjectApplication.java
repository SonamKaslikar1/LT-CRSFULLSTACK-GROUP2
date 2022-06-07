package com.lt.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.lt.*"})
@EnableWebMvc 
public class LtGroup2CrsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(LtGroup2CrsProjectApplication.class, args);
	}

}
