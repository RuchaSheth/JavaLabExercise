package com.capgemini.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter Number of Elements in Array :");
		int size = sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter Elements :");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int small=getSecondSmallest(arr);
		System.out.println("Second Smallest Element in Array is:"+small);
	}
	public static int getSecondSmallest(int[] arr) {
		Arrays.sort(arr);
		return arr[1];
	}

}
