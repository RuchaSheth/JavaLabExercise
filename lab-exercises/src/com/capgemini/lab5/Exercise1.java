package com.capgemini.lab5;

import java.util.Scanner;

import com.cg.eis.exception.InvalidAgeException;

public class Exercise1 {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter age");
		
		try {
			int age = sc.nextInt();
			if(age<15)
				throw new InvalidAgeException("You have entered invalid Age,Age must be above 15");
			System.out.println("Valid Age !!!");
		}catch(InvalidAgeException ex)
		{
			ex.printStackTrace();
		}
	}
}
