package com.springapp.Runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class MyApplicationRunner implements ApplicationRunner {@Override
	
	public void run(ApplicationArguments args) throws Exception {
	
	System.out.println("App Runner run()..  method...");
	// TODO Auto-generated method stub
	
}

}
