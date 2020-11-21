package com.capgemini.lab1;

import java.util.Scanner;

public class Exercise6 {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number: ");
		int no = sc.nextInt();
		System.out.println("Difference : "+calculateDifference(no));
	}
	private static int calculateDifference(int no) {
		// TODO Auto-generated method stub
		int sum=0,sqrSum=0;
		int sqr=0;
		for(int i=1;i<=no;i++)
		{
			sqr=i*i;
			sqrSum+=sqr;
			sum+=i;
		}
		return sqrSum-(sum*sum);
	}

}
