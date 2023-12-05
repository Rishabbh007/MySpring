package com.springcore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructor/ConstructorConfig.xml");
		 Person person1 = (Person)context.getBean("person");
//		 System.out.println(person1);

		 Addition add = (Addition)context.getBean("add");
		 add.doSum();
		 
		 

	}

}
