package com.vinu.myfirstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.vinu.myfirstproject")
public class MyfirstprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstprojectApplication.class, args);
		System.out.println("Mahalakshmi Application Ran successfully ...!");
	}
}