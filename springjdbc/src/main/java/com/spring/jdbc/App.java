package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entities.Student;

public class App {

	public static void main(String[] args) {

		System.out.println("My Program started.......");
		// spring jdbc => JdbcTemplate

//		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/Config.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);

		
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		// insert
//		Student student = new Student();
//		student.setId(886);
//		student.setName("John");
//		student.setCity("Mumbai");
//		
//		int result = studentDao.insert(student);
//		
//		System.out.println("student added "+ result);

		// update
//		Student student = new Student();
//		student.setId(436);
//		student.setName("Dk Chopra");
//		student.setCity("Gurugram");
//
//		int result = studentDao.change(student);
//		System.out.println("Data changed " + result);
		
		
		// Delete
//		int result = studentDao.delete(336);
//		System.out.println("Data deleted "+ result);
		
		// Single Student
//		Student student =studentDao.getStudent(886);
//		System.out.println(student);
		
		
		List<Student> students =  studentDao.getAllStudent();		
		for(Student s : students) {
			System.out.println(s+" ");
		}
		
	}

}
