package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import com.bean.Person;

public class Test {
	
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/applicaitonContext.xml");
		
		Person person = (Person)context.getBean("chinese");
		
		person.Speak();
		
		person=(Person)context.getBean("american");
		
		person.Speak();
		
//		ApplicationContext context2 = new FileSystemXmlApplicationContext("C:/Users/lpf18/eclipse-workspace/SpringDemo/resource/applicaitonContext.xml");
//
//		ApplicationContext context3 = new XmlWebApplicationContext();
	}

}
