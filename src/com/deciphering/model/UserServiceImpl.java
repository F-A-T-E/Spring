package com.deciphering.model;

public class UserServiceImpl implements UserService{

	private UserDao userDao;
	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}
	
	public UserDao getUserDao() {
		return userDao;
	}
	
	public void setUserDAO(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public UserServiceImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
}
