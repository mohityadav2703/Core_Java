package com.test.mock;

public class UserService {
	
	private UserDao dao;
	
	public UserService() {
		
	}

	public UserService(UserDao dao) {
		this.dao = dao;
	}
	
	public String getNameUserId(Integer id) {
		String name=dao.findNameById(id);
		return name;
	}
	
	public String getEmailById(Integer id) {
		String email=dao.findEmailById(id);
		return email;	
	}
}
