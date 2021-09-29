package com.deciphering;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {
	
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld hello = (HelloWorld)context.getBean("helloworld");
		hello.sayHello();
	}

}
