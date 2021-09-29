package com.deciphering.test;

import org.junit.Test;

import com.deciphering.carImplmention.BMWCar;
import com.deciphering.human.Car;
import com.deciphering.human.Human;
import com.deciphering.spring.ClassPathXmlApplicationContext;

public class HumanTest {
	
	@Test
	public void testHuman() throws Exception{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext();
		Human human = (Human)ctx.getBean("human");
		Car car = (BMWCar)ctx.getBean("car");
		human.setcar(car);
		human.myCarRun();		
	}
}
