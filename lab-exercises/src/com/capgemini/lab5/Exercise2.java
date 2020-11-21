package com.capgemini.lab5;

import java.util.Scanner;

import com.cg.eis.exception.InvalidNameException;

public class Exercise2 {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Your Name:");
		try {
			String str = sc.nextLine();
			String [] name = new String[2];
					name = str.split(" ");
		
			if((name[0].isEmpty())||(name[1].isEmpty()))
				throw new InvalidNameException("You Have entered Invalid Name,"
						+ "Please Enter Both FirstName and LastName ");
			System.out.println("Welcome "+str.toUpperCase()+" !");
		}catch(InvalidNameException e)
		{
			e.printStackTrace();
		}
		
	}

}
