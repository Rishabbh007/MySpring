package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");

		StudentDao studentDao = context.getBean("StudentDao", StudentDao.class);

//		Student student = new Student(2008, "Anant Kumar", "Banaras");
//		int r = studentDao.insert(student);		 
//		System.out.println("Done..."+r);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean go = true;
		while (go) {

			System.out.println("Press 1 for add new student");
			System.out.println("Press 2 for display all students");
			System.out.println("Press 3 for get details of single student");
			System.out.println("Press 4 for delete students");
			System.out.println("Press 5 for update student");
			System.out.println("Press 6 for exit");

			try {
				int input = Integer.parseInt(br.readLine());

				switch (input) {
				case 1:
					// add a new student

					// taking inputs from users
					System.out.println("Enter user id: ");
					int uid = Integer.parseInt(br.readLine());

					System.out.println("Enter user name: ");
					String uName = br.readLine();

					System.out.println("Enter user city");
					String uCity = br.readLine();

					// creating student object and setting values
					Student student = new Student();
					student.setStudentId(uid);
					student.setStudentName(uName);
					student.setStudentCity(uCity);

					// saving student object to database by calling insert of student dao
					int r = studentDao.insert(student);
					System.out.println(r + " student added");
					System.out.println("***********************************************");
					System.out.println();

					break;
				case 2:
					// display all students
					System.out.println("***********************************************");
					List<Student> allStudent = studentDao.getAllStudent();
					for (Student s : allStudent) {

						System.out.println("Name : " + s.getStudentName());
						System.out.println("Id : " + s.getStudentId());
						System.out.println("City : " + s.getStudentCity());
						System.out.println("_______________________________________________");

					}
					System.out.println("***********************************************");

					break;
				case 3:
					// get single student data
					System.out.println("***********************************************");
					System.out.println("Enter user id: ");
					int userId = Integer.parseInt(br.readLine());
					Student student2 = studentDao.getStudent(userId);
					System.out.println("Id : " + student2.getStudentId());
					System.out.println("Name : " + student2.getStudentName());
					System.out.println("City : " + student2.getStudentCity());

					System.out.println("***********************************************");
					break;
				case 4:
					// delete student
					System.out.println("***********************************************");
					System.out.println("Enter user id: ");
					int id = Integer.parseInt(br.readLine());
					studentDao.deleteStudent(id);
					System.out.println("Student deleted...");

					System.out.println("***********************************************");
					break;
				case 5:
					// update the student

					System.out.println("***********************************************");

					System.out.println("Enter user id: ");
					int upid = Integer.parseInt(br.readLine());

					System.out.println("Enter user name: ");
					String upName = br.readLine();

					System.out.println("Enter user city");
					String upCity = br.readLine();

					// creating student object and setting values
					Student student3 = new Student();
					student3.setStudentId(upid);
					student3.setStudentName(upName);
					student3.setStudentCity(upCity);

					studentDao.updateStudent(student3);
					System.out.println("Student Updated...");

					System.out.println("***********************************************");
					break;
				case 6:
					// exit
					go = false;
					break;
				}
			} catch (Exception e) {

				System.out.println("Invalid Input Try with another one !!");
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Thank you using this application");
		System.out.println("See you soon!!!");
	}
}
