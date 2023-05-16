package com.SBMC;

public class PetrolEng  implements IEngine{

	@Override
	public int start() {
		System.out.println("Petrol engine is start...");
		return 1;
	}

}
