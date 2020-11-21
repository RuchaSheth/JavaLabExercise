package com.capgemini.lab1;

import java.util.Scanner;

public class Exercise7 {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		boolean result = checkNumber(num);
		System.out.println(result);
	}
	private static boolean checkNumber(int num) {
		/*
		 * Separate each digit of number. 
		 * count iterations to know total number of digits in number.
		 * if digit1>=digit2 , increment another counter.
		 * like this check for each digit .
		 * if both counters are same , number is increasing number. 
		*/
		boolean result = true;
		int digit1=0,digit2=0,counter1=0,counter2=0;
		while(num!=0)
		{
			digit1=num%10;
			num=num/10;
			digit2=num%10;
			if(digit1>=digit2)
				counter1++;
			num=num/10;
			counter2++;
		}
		if(counter1==counter2)
			result=true;
		else
			result = false;
		return result;
	}

}
