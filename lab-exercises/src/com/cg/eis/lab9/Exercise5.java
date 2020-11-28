package com.cg.lab9;

import java.util.Scanner;

public class Exercise5 {

	public int factorial(int num)
	{
		int fact=1 ;
		for(int i=1;i<=num;i++)
		{
			fact =fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		Exercise5 ex = new Exercise5();
		
		FactInterface fact = ex::factorial;
		
		System.out.println("Factorial of "+num+" is "+fact.factorial(num));
		
		sc.close();
	}

}
