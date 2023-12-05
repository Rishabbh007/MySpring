package com.springcore.javaconfig1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoTest {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Student student = context.getBean("little", Student.class);
		System.out.println(student);
		student.study();
	}

}
