package com.rays.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.rays.dto.UserDTO;

@Component("testService")
public class TestService {

	@Autowired
	public UserServiceInt service = null;

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Shivanshi.xml");

		TestService test = (TestService) context.getBean("testService");

		
		  //test.testAdd();
		//test.testUpdate();
		//test.testDelete();
		//test.testFindByPK();
		test.testSearch();
		 
	}

	public void testAdd() {
		UserDTO dto = new UserDTO();
		dto.setId(4);
		dto.setFirstName("Sanu");
		dto.setLastName("gupta");
		dto.setLogin("admin");
		dto.setPassword("6789");
		long pk = service.add(dto);
		System.out.println("Data Inserted... pk = " + pk);
	}
	
	public void testUpdate() {
		UserDTO dto = new UserDTO();
		dto.setId(2);
		dto.setFirstName("Dipanshi");
		dto.setLastName("gupta");
		dto.setLogin("college");
		dto.setPassword("1234");
		service.update(dto);
		System.out.println("Data update...");
	}
	
	public void testDelete() {
		service.delete(3);
		System.out.println("delete");
	}
	
	public void testFindByPK() {
		UserDTO dto =service.findbyPk(2);
		
		if(dto!=null ) {
			System.out.println(dto.getId());
			System.out.println(dto.getFirstName());
			System.out.println(dto.getLastName());
			System.out.println(dto.getLogin());
			System.out.println(dto.getPassword());
		}else {
			System.out.println("User id does not exist...");
		}
	}
	
	public void testSearch() {
		UserDTO dto = new UserDTO();
		List<UserDTO> list =service.search(dto, 0, 5);
	      Iterator it =	list.iterator();
	
	    while (it.hasNext()) {
		dto = (UserDTO) it.next();
		System.out.println(dto.getId());
		System.out.println(dto.getFirstName());
		System.out.println(dto.getLastName());
		System.out.println(dto.getLogin());
		System.out.println(dto.getPassword());
		
	}
	}
	

}
