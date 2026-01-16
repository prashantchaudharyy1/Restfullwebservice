package com.example.restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.example")
public class RestfullwebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfullwebserviceApplication.class, args);
	}

}
