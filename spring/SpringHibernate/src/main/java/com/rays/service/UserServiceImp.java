package com.rays.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rays.dao.UserDaoInt;
import com.rays.dto.UserDTO;

@Service
public class UserServiceImp implements UserServiceInt{
	
	@Autowired
	private UserDaoInt dao = null;

	@Transactional(propagation = Propagation.REQUIRED)
	public long add(UserDTO dto) {
		long pk =dao.add(dto);
		
		return pk;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void update(UserDTO dto) {
      dao.update(dto);		
	}

	@Transactional(readOnly = true)
	public List search(UserDTO dto) {
		
		
		return dao.search(dto);
	}
@Transactional(readOnly = true)
	public List search(UserDTO dto, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return dao.search(dto, pageNo, pageSize);
	}

   @Transactional(propagation = Propagation.REQUIRED)
	public UserDTO delete(long id) {
	   UserDTO deleteUser = dao.delete(id);
	   
		return deleteUser;
	}

   @Transactional(readOnly = true)
	public UserDTO findByLogin(String login) {
		
		return dao.findByLogin(login);
	}
  
   @Transactional(readOnly = true)
	public UserDTO findByPK(long pk) {
		// TODO Auto-generated method stub
		return dao.findByPk(pk);
	}

   @Transactional(readOnly = true)
	public UserDTO authenticate(String login, String password) {
		UserDTO user = dao.authenticate(login, password);
		return user;
	}

}
