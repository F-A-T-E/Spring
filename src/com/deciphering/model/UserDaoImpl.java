package com.deciphering.model;

public class UserDaoImpl implements UserDao{

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getUsername() + " saved in Oracle");
		
//		System.out.println(user.getUsername() + "saved in Oracle");

	}

}
