package com.rays.dao;

import java.util.List;

import com.rays.dto.UserDTO;

public interface UserDaoInt {
	
	public long add(UserDTO dto);
	public void update(UserDTO dto);
	public UserDTO delete(long id);
	public UserDTO findByPk(long pk);
	public UserDTO findByLogin(String login);
	public UserDTO authenticate (String login,String password);
	public List search(UserDTO dto);
	public List search(UserDTO dto, int pageNo,int pageSize);

}
