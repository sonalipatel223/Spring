package com.rays.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rays.dao.UserDaoInt;
import com.rays.dto.UserDTO;

@Service
public class UserserviceImp implements UserServiceInt {

	@Autowired
	private UserDaoInt dao = null;

	public long add(UserDTO dto) {

		System.out.println("in service add method");

		long pk = dao.add(dto);

//		if (dto.getLogin().equals("admin")) {
//			throw new RuntimeException("User with login admin not allowed");
//
//		}

		return pk;
	}

	public void update(UserDTO dto) {

		dao.update(dto);
	}

	public void delete(long id) {

		dao.delete(id);
	}

	public UserDTO findByLogin(String login) {

		return dao.findByLogin(login);
	}

	public UserDTO findbyPk(long pk) {

		return dao.findByPK(pk);
	}

	public UserDTO authenticate(String login, String password) {
		UserDTO user = dao.authenticate(login, password);

		return user;
	}

	public List search(UserDTO dto) {
		return dao.search(dto);
	}

	public List search(UserDTO dto, int pageNo, int pageSize) {
		return dao.search(dto, pageNo, pageSize);
	}

}
