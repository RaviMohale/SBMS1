package com.SBMC;

//public class Car extends Engine {  // inheritance approach i.e  IS- relation
public class Car{
	
	//private IEngine eng ;
	 IEngine eng ;  // filed injection
	
//	public Car(IEngine eng) {
//		this.eng = eng;
//		
//	}
	
	public void setEng(IEngine eng) {
		this.eng = eng;
	}
	
	public void drive() {
		
		//Engine eng = new Engine();   // composition    HAS-A relation
		
	//int status	= super.start();
	
		int status	= eng.start();
		
	if(status >= 1) {
			System.out.println("Engine start");
	}else {
				System.out.println("Engine fail");
	      }
		
			}

	}
