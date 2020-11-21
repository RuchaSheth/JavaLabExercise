package com.cg.eis.exception;

public class EmployeeException extends Exception{
	String str;

	public EmployeeException() {
		super();
	}

	public EmployeeException(String str) {
		super();
		this.str = str;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return str;
	}

}
