package com.untitled.poject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PojectApplication {

	public static void main(String[] args) {
		PojectApplication.class.getAnnotations();
		SpringApplication.run(PojectApplication.class, args);
	}

}
