package com.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
@EntityScan("com")
public class Wc24WorldcupApplication {

	public static void main(String[] args) {
		SpringApplication.run(Wc24WorldcupApplication.class, args);
	}

}
