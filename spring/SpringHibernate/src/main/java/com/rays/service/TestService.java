package com.rays.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.rays.dto.UserDTO;

@Component("testService")
public class TestService {
	
	public static ApplicationContext context=null;

	@Autowired
	public UserServiceInt service = null;
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Shivanshi.xml");
		TestService test = (TestService) context.getBean("testService");
	
		test.testAdd();
	
	}
	
	public void testAdd() {
		UserDTO dto = new UserDTO();
		// dto.setId(1);
		dto.setFirstName("shiv");
		dto.setLastName("gupta");
		dto.setLogin("Shiv@gmail.com");
		dto.setPassword("pass12344");
		long pk = service.add(dto);
		System.out.println("PK->" + pk);
	}
	
	
}
