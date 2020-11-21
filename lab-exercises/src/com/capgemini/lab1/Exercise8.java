package com.capgemini.lab1;

import java.util.Scanner;

public class Exercise8 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the no : ");
		int no = sc.nextInt();
		boolean result = checkNumber(no);
		System.out.println(result);
	}
	private static boolean checkNumber(int no) {
		// TODO Auto-generated method stub
		boolean result = true;
		while(no!=1)
		{
			
			if(no%2==1)
			{
				result = false;
			}
			no=no/2;
		}
		return result;
	}
}
