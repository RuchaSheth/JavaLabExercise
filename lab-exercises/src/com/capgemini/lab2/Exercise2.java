package com.capgemini.lab2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Rucha Sheth
 *
 */
public class Exercise2 {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Number of Elements in Array :");
		int size = sc.nextInt();
		String arr[]=new String[size];
		sc.nextLine();
		
		System.out.println("Enter Strings :");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.next();
		}
		
		String arr1[]= sortStrings(arr);
		for(int i=0;i<size;i++)
			System.out.print(arr1[i]+" ");
		
	}
	private static String[] sortStrings(String[] arr) {
		// TODO Auto-generated method stub
		int mid=0;
		int size = arr.length;
		String arr1[]=new String[size];
		Arrays.sort(arr);
		if(size%2==0)
		 	mid=size/2;
		else
			mid=(size/2)+1;
		
		for(int i=0;i<mid;i++)
		{
			arr1[i]=arr[i].toUpperCase();
		}
		for(int i=mid;i<size;i++)
		{
			arr1[i]=arr[i].toLowerCase();
		}
		return arr1;
	}

}
