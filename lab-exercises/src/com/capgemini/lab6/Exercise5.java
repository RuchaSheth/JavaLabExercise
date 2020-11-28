package com.capgemini.lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number of Elements :");
	int size = sc.nextInt();
	
	int arr[] = new int[size];
	System.out.println("Enter Elements in Array: ");
	for (int i = 0; i < size; i++) 
	{
	   arr[i]= sc.nextInt();
	}
	
	System.out.println("Second Smallest Element in the Array is: "+getSecondSmallest(arr));
	
		sc.close();
	}
	
	public static int getSecondSmallest(int arr [])
	{
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			list.add(arr[i]);
		}
	
		Collections.sort(list);
		return list.get(1);
	}

}
