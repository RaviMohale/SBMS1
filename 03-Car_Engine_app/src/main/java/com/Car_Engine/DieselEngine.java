package com.Car_Engine;

public class DieselEngine implements IEngine {
	
	public DieselEngine() {
		System.out.println("Diesel Engine constructor...");
	}
	
	
	@Override
	public int start() {
		
		System.out.println("diesel engine started......");
		// TODO Auto-generated method stub
		return 1;
	}

}
