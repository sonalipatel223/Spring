package com.rays.autowire.constructor;

public class UserService {
	
	private UserDao userDao;

	
	
	
	public UserService(UserDao userDao) {
		
		this.userDao = userDao;
	}




	public void add() {
		userDao.add();
		
	}

}
