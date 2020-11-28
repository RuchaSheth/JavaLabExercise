package com.cg.lab9;

import java.util.Scanner;

public class Exercise3Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username:");
		String uname= sc.nextLine();
		
		System.out.println("Enter Password:");
		String pass = sc.nextLine();
		
		Exercise3 authenticate = (userName,password)->
		  {
			if(uname.equals("admin")&&(pass.equals("admin123")))
				return true;
			else
				return false;
			};
			
		Boolean result = authenticate.isAuthenticate(uname, pass);
		
		System.out.println(result);
		/*
		 * if(result) System.out.println("You are Authenticated!!"); else
		 * System.out.println("Invalid Credentials");
		 */
		sc.close();
	}

}
