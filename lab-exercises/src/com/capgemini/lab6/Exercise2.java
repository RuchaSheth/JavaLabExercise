package com.capgemini.lab6;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Elements: ");
		int size = Integer.parseInt(sc.nextLine());
		
		char [] arr = new char[size];
		
		System.out.println("Enter characters in array:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.next().charAt(0);
		}
		
		Map<Character, Integer> map1 = countChars(arr);
		
		System.out.println("Sorted Array is : ");
		for(Map.Entry<Character,Integer> i:map1.entrySet())
		{
			//System.out.println(i.getKey()+" "+i.getValue());
			System.out.println(i.getKey());
		}
		sc.close();
	}
	
	/**
	 * @param arr
	 * @return sorted array of characters
	 */
	public static Map<Character,Integer> countChars(char [] arr){
		
		Map<Character,Integer> map1 = new TreeMap<>();
		for(int i=0;i<arr.length;i++)
		{
			map1.put(arr[i],i);
		}
		
		return map1;
		
	}
	
}
