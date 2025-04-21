package com.rays.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {
	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("lifecycle2.xml");
		MyBeanAnnotation annotation =(MyBeanAnnotation) context.getBean("myBeanAnnotation");
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
