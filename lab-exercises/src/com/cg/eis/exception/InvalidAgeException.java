package com.cg.eis.exception;

public class InvalidAgeException extends Exception{
	/**
	 * 
	 */
	private String str ;
	
	public InvalidAgeException() {
		
	}
	
	public InvalidAgeException(String str)
	{
		this.str=str;
	}
	
	public String getMessage()
	{
		return str;
	}

}
