package com.springcore.javaconfig2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springcore.javaconfig2")
public class Config2 {
	
	public Samosa2 getSamosa() {
		
		
		return new Samosa2();
		
	}
	
	public Student2 getStudent() {
		
		//creating a new student object 
		Student2 student = new Student2(getSamosa());
		
		return student;
	}

}
