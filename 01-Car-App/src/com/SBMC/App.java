package com.SBMC;


public class App {
	public static void main(String[] args) {
		
		
		Car car = new Car();
		//car.setEng(new DesileEng());// setter injection
		car.eng = new PetrolEng(); // field injection
		car.drive();
	}
}
