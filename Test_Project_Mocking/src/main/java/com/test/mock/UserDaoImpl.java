package com.test.mock;

public class UserDaoImpl implements UserDao {
	
	public String findNameById(Integer id) {
		System.out.println("findNameById() called");
		return "John";
	}

	
	public String findEmailById(Integer id) {
		System.out.println("FindEmailById() called ");
		return "john.k@gmail.com";
	}


}
