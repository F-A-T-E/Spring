package com.deciphering.model;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {

	@Test
	public void testAdd() throws Exception{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserServiceImpl service = (UserServiceImpl)context.getBean("userService");
		User u = new User();
		u.setUsername("username");
		u.setPassword("12345");
		service.add(u);
	}
}
