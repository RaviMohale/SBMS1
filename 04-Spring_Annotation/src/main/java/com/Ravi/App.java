package com.Ravi;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.Ravi.Car.Engine;

@Configuration
@ComponentScan
public class App {
	
	public App() {
		System.out.println("App :: Constructor..");
		// TODO Auto-generated constructor stub
	}
		
	@Bean
	public Engine getEngine() {
		Engine eng = new Engine();
		return eng;
	}

}
