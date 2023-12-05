package com.springcore.auto.wire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestAutoWire {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/auto/wire/AutoWireConfig.xml");

		Employee emp1 = (Employee) context.getBean("emp");

		System.out.println(emp1);
		
		context.registerShutdownHook();

	}

}
