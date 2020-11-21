package com.capgemini.lab3;

import java.util.Scanner;

public class Exercise8 {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter String :");
		String str = sc.nextLine();
		System.out.println(isPositiveString(str));
	}
	private static boolean isPositiveString(String str) {
		int flag=1;
		char [] arr = str.toCharArray();
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]<arr[i+1])
			{
				flag++;
			}
		}
		if(flag==arr.length)
			return true;
		else
			return false;
	}

}
