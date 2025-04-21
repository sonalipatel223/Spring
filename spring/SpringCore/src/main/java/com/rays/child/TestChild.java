package com.rays.child;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestChild {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Child.xml");
	TestBean testbean =	(TestBean) context.getBean("derivedTestBean");
	System.out.println(testbean.toString());
	}

}
