package com.deciphering.carImplmention;

import com.deciphering.human.Car;

public class BMWCar implements Car{
	
	private String MyBrand = "宝马";

	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return MyBrand;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(MyBrand + " is running!");
	}

}
