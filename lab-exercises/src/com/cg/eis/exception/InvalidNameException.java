package com.cg.eis.exception;

public class InvalidNameException extends Exception{

	private String str;

	public InvalidNameException() {
		super();
	}

	public InvalidNameException(String str) {
		super();
		this.str = str;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return str;
	}
}
