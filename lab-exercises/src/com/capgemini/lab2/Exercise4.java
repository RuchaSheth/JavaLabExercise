package com.capgemini.lab2;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in array:");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter Elements:");
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		
		int arr1[]=modifyArr(arr);
		for(int i=0;i<arr1.length;i++)
			System.out.println(arr1[i]+" ");
		sc.close();
  }

	private static int[] modifyArr(int[] arr) {
		// TODO Auto-generated method stub
		int size=arr.length;
		int k=0;
		int modifiedArr[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					modifiedArr[k]=arr[i];
					k++;
				}
			}
		}
		return modifiedArr;
	}
	
 	
}
