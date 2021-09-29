package com.deciphering.human;

public class Human {
	private Car car;
	
	public Car getCar() {
		return car;
	}
	public void setcar(Car car) {
		this.car = car;
	}	
	public void myCarRun() {
		car.run();
	}
}
