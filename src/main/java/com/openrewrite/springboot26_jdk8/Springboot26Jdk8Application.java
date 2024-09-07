package com.openrewrite.springboot26_jdk8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot26Jdk8Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot26Jdk8Application.class, args);
		System.out.println("Application Started");
	}

}
