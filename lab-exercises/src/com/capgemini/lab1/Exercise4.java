package com.capgemini.lab1;

import java.util.Scanner;

public class Exercise4 {

	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	   System.out.println("Enter Integer :");
	   int no = sc.nextInt();
	   System.out.println("Prime Numbers Between 1 to "+no+" are : ");
	   primeNo(no);
	}
	private static void primeNo(int no) {
		// TODO Auto-generated method stub
		int count;
		for(int i=2;i<=no;i++)
		{
		   count =0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==2)
				System.out.print(i+" ");
		}
	}
}
