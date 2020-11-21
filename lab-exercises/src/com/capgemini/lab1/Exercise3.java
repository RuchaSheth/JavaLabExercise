package com.capgemini.lab1;

import java.util.Scanner;

public class Exercise3 {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number:");
		int no = sc.nextInt();
		
		System.out.println("Using Recursive Function : "+rec_fibonacci(no));
		System.out.println("Using Non-Recursive Function : "+nonRec_fibonacci(no));
	}
	private static int nonRec_fibonacci(int no) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1,sum=0;
		for(int i=2;i<=no;i++)
		{
			sum=a+b;
			a=b;
			b=sum;
		}
		return sum;
	}
	private static int rec_fibonacci(int no) {
		// TODO Auto-generated method stub
		if(no==1)
			return 1;
		else if(no==0)
			return 0;
		return rec_fibonacci(no-1)+ rec_fibonacci(no-2);
	}

}
