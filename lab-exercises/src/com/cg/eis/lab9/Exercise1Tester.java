package com.cg.lab9;

import java.util.Scanner;

public class Exercise1Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st number:");
		int n1 = sc.nextInt();
		System.out.println("Enter 2nd number:");
		int n2 = sc.nextInt();
		
		Exercise1 calculate = (num1,num2)->(int)Math.pow(num1,num2);
		
		int result = calculate.powerOfNum(n1,n2);
		System.out.println(n1+"^"+n2+" = "+result);
		
		sc.close();
		
	}

	
}
