package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStereotype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/StereoConfig.xml");
//		Student student = (Student) context.getBean("student");

//		System.out.println(student);
//		System.out.println(student.getAddress());
//		System.out.println(student.getAddress().getClass());
		
//		System.out.println(student.hashCode());
		
//		Student student1 = (Student) context.getBean("student");
		
//		System.out.println(student1.hashCode());
		
		Teacher teacher =context.getBean("teacher", Teacher.class);
		
		System.out.println(teacher.hashCode());
		
		Teacher teacher1 =context.getBean("teacher", Teacher.class);

		System.out.println(teacher1.hashCode());

		
		Student student2 =context.getBean("ob", Student.class);
		
		System.out.println(student2);

	}

}
