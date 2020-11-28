package com.capgemini.lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Elements: ");
		int size = sc.nextInt();
		int arr[] =new int[size];
		
		System.out.println("Enter Elements :");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Numbers and Square of Number");
		
		Map<Integer,Integer> arrMap = new HashMap<Integer, Integer>();
		arrMap=getSquares(arr);
		
		for(Map.Entry<Integer, Integer> m:arrMap.entrySet())
			{
			System.out.println(m.getKey()+" ----> "+m.getValue());
			}
		sc.close();
	}

	/**
	 * @param arr
	 * @return HashMap having number and square of number 
	 * as (key , value) pair
	 * 
	 */
	private static Map<Integer, Integer> getSquares(int[] arr) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> map1 = new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			map1.put(arr[i], arr[i]*arr[i]);
		}
		return map1;
	}
}
