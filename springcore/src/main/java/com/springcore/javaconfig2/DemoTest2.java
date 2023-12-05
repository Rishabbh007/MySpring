package com.springcore.javaconfig2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoTest2 {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Config2.class);
		Student2 student = context.getBean("student2", Student2.class);
		System.out.println(student);
		student.study();
	}

}
