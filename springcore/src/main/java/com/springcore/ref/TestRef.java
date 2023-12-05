package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/RefConfig.xml");
		 A obj = (A)context.getBean("aref");
		 
		 System.out.println(obj.getX());
		 System.out.println(obj.getOb().getY());


	}

}
