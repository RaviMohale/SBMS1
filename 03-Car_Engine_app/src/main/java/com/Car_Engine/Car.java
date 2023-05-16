package com.Car_Engine;

public class Car {
	
	private IEngine engine;
	
	
	public void drive() {
		
		int status = engine.start();
		
		if(status >= 1) {
			System.out.println("journey started...");
		}else {
			System.out.println("engine trouble...");
		}
		
	}

}
