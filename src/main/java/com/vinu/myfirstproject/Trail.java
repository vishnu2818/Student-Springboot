package com.vinu.myfirstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;

public class Trail {
	
	@Value("${my.name.is}")//way 1 to read Application.properties file 
	public String name;
	
	@Autowired
	public Environment env;//2nd Way to read Application.properties file ===Environ
	
	public void printName() {
		System.out.println(name);
		System.out.println("From Env interface "+env.getProperty("my.name.is"));
	}
}