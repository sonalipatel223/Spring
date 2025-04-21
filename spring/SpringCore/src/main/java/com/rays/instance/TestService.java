package com.rays.instance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Instance.xml");
	ServiceLocator locator =	(ServiceLocator) context.getBean("serviceLocator");
	
	 ServiceLocator s = locator.getInstance();
	}

}
