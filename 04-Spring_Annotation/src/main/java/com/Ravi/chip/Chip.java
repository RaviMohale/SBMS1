package com.Ravi.chip;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Chip {
	
	public Chip() {
		System.out.println("Chip :: zero param contructor");
	}
	
	public String ChipType(){
		return " 32-bit";
	}

}
