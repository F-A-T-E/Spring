package com.deciphering;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExampleBean {
		
	private String name;
	private int age;
	private float height;
	private boolean isChinese;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public boolean isChinese() {
		return isChinese;
	}
	public void setChinese(boolean isChinese) {
		this.isChinese = isChinese;
	}
	
	@Override
	public String toString() {
		return "ExampleBean [name=" + name + ", age=" + age + ", height=" + height + ", isChinese=" + isChinese + "]";
	}
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		ExampleBean eb = (ExampleBean)ctx.getBean("exampleBean");
		System.out.println(eb);
	}

}
