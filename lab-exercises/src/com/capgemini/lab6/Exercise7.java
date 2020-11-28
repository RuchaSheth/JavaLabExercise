package com.capgemini.lab6;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of elements:");
		int size = sc.nextInt();
		
		Integer arr[]=new Integer[size];
		System.out.println("Enter Elements:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		Integer arr1[]=getSorted(arr);
		System.out.println("\nSorted Array of Reverse Number is : ");
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		
		sc.close();
	}

	public static Integer [] getSorted(Integer arr[])
	{
		int size = arr.length;
		String[] str= new String[size];
		// convert to string and reverse each element
		System.out.println("Reverse of Each Number :");
		for(int i=0;i<size;i++)
		{
			str[i]= arr[i].toString();
			StringBuffer sb = new StringBuffer(str[i]);
			str[i]=sb.reverse().toString();
			System.out.print(str[i]+" ");
		}
		    
		// Sort the array by convert String array to Integer Array
		Integer [] newList = new Integer[str.length];
		for(int i=0;i<str.length;i++)
		{
			newList[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(newList);
		
		return newList;
	}
}
