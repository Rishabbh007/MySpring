package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestLifeCycleMethods {
	
	public static void main(String[] args) {
		
    	 AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/LifeCycleConfig.xml");

		 Samosa obj = (Samosa)context.getBean("s1");
		 
		 System.out.println(obj);
		 
		 context.registerShutdownHook();
		 
//		 System.out.println("--------------------------------");
//		 Pepsi p1 =(Pepsi)context.getBean("p1");
//		 
//		 System.out.println(p1);
		 
//		 Example example = (Example)context.getBean("example");
//		 
//		 System.out.println(example);
		 
		 
		 
	}

}
