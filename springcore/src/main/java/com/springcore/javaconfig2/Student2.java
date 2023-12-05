package com.springcore.javaconfig2;

import org.springframework.stereotype.Component;

@Component
public class Student2 {
	
	private Samosa2 samosa;
	
	public Samosa2 getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa2 samosa) {
		this.samosa = samosa;
	}

	public Student2(Samosa2 samosa) {
		super();
		this.samosa = samosa;
	}

	public void study() {
		samosa.eat();
		System.out.println("Go study !!!");
	}

	@Override
	public String toString() {
		return "Student2 [samosa=" + samosa.getClass() + "]";
	}
	
	

}
