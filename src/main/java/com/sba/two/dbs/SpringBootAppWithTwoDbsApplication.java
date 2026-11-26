package com.sba.two.dbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAppWithTwoDbsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppWithTwoDbsApplication.class, args);
		System.out.println("Spring Boot Application has been started successfully....");
	}

}
