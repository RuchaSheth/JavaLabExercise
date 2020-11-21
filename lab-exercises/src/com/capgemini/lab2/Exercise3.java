package com.capgemini.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter number of elements");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter the elements: ");
		
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		
		int[] arr1 = getSorted(arr);
		System.out.println("Sorted Array is :");
		for(int i=0;i<size;i++)
			System.out.print(arr1[i]+" ");
		
	}
	private static int[] getSorted(int[] arr) {
		// TODO Auto-generated method stub
		int [] rev = new int[arr.length];
		int i=0;
		for(int j=arr.length-1;j>=0;j--)
		{
			rev[i]=arr[j];
			i++;
		}
		System.out.println("Reverse Array is :"+Arrays.toString(rev));
		Arrays.sort(rev);
		return rev;
	}
}
