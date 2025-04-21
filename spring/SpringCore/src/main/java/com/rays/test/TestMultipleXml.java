package com.rays.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rays.bean.PersonBean;
import com.rays.bean.UserBean;

public class TestMultipleXml {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Multiple.xml");
		UserBean bean =(UserBean) context.getBean("user");
		
		System.out.println(bean.getName());
		System.out.println(bean.getLogin());
		System.out.println(bean.getPassword());
		
		PersonBean person = (PersonBean) context.getBean("person");
		System.out.println(person.getAddress());
		
		
		
	}

}
