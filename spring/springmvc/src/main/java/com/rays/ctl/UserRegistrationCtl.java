package com.rays.ctl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rays.dto.UserDTO;
import com.rays.form.UserRegistrationForm;
import com.rays.service.UserService;
import com.rays.util.DataUtility;

@Controller
@RequestMapping(value = "Register")

public class UserRegistrationCtl {

	@Autowired
	public UserService service;
	
	@GetMapping
	public String display(@ModelAttribute("form")UserRegistrationForm form) {
		
		
		return "UserRegistration";
		
	}
	
	@PostMapping
	public String submit(@ModelAttribute("form")UserRegistrationForm form) {
		
		UserDTO dto = new UserDTO();
		
		dto.setFirstName(form.getFirstName());
		dto.setLastName(form.getLastName());
		dto.setLogin(form.getLogin());
		dto.setPassword(form.getPassword());
		dto.setDob(DataUtility.stringToDate(form.getDob()));
		dto.setAddress(form.getAddress());
		
		service.add(dto);
		
		
		return "UserRegistration";
		
	}
	
}
