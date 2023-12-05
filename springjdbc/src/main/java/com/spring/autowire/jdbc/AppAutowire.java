package com.spring.autowire.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.autowire.jdbc.dao.StudentDaoAutowire;
import com.spring.autowire.jdbc.entities.StudentAutowire;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entities.Student;

public class AppAutowire{
	public static void main(String[] args) {

		System.out.println("My program started................");

		// spring jdbc=> JdbcTemplate 
		// Through XML Configuration file
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/Config.xml");

		// Through java configuration class file / Annotation configuration 
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfigAutowire.class);
		
		StudentDaoAutowire studentDaoAutowire = context.getBean("studentDaoAutowire", StudentDaoAutowire.class);

		System.out.println("Hello World Autowired...");
		
		// insert
//		Student student = new Student();
//		student.setId(83);
//		student.setName("Deepak Gupta");
//		student.setCity("Ambala");
//
//		int result = studentDao.insert(student);
//		
//		System.out.println("student added "+ result);

		// update
//		Student student = new Student();
//		student.setId(7);
//		student.setName("Aman");
//		student.setCity("Banaras");
//		
//		int result = studentDao.change(student);
//		System.out.println("Data changed "+result);

		// delete
//		int result = studentDao.delete(7);
//		System.out.println("Data Deleted: "+result);

		// select
//		Student result = studentDao.getStudent(15);
//		System.out.println("Data Selected: " + result);
		
		
		// List of data selected 
		List<StudentAutowire> students=studentDaoAutowire.getAllStudent();
		
		for (StudentAutowire s : students) {
			System.out.println(s);			
		}
	}
}
