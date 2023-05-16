package com.Car_Engine;

public class Petrol_Engine implements IEngine{
	
	public Petrol_Engine() {
		System.out.println("Petrol engine constructor...");
	}
	
	@Override
	public int start() {
		System.out.println("petrol engine started...");
		// TODO Auto-generated method stub
		return 1;
	}

}
