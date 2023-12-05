package com.springcore.javaconfig1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public Samosa getSamosa() {
		
		
		return new Samosa();
		
	}
	
	@Bean(name= {"s2","little"})
	public Student getStudent() {
		
		//creating a new student object 
		Student student = new Student(getSamosa());
		
		return student;
	}

}
