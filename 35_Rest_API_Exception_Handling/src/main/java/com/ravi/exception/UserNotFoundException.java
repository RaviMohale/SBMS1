package com.ravi.exception;

public class UserNotFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6992696234540391396L;


	public UserNotFoundException() {
		// TODO Auto-generated constructor stub
	}
	

	public UserNotFoundException(String msg) {
		super(msg);
	}

}
