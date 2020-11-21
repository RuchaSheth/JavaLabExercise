package com.capgemini.lab1;

import java.util.Scanner;

/**
 * @author Rucha Sheth
 * Program to find sum of cube of digits of a number
 */
public class Exercise1 {
 
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("Enter a number");
	int no = sc.nextInt();
	long cube = digitCube(no);
	System.out.println("Sum of Cube of each digit in "+no+" is:"+cube);
}
	private static long digitCube(int no) {
		// TODO Auto-generated method stub
		long sum=0;
		int m=0;
		while(no!=0)
		{
			m=no%10;
			sum+=(m*m*m);
			no=no/10;
		}
		return sum;
	}
}
