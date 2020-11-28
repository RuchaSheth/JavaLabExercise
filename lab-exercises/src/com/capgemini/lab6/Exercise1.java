package com.capgemini.lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		System.out.println("Enter number of elements:");
		int size = sc.nextInt();
		System.out.println("Enter Elements :");
		for(int i=0;i<size;i++)
		{
			map.put(i, Integer.parseInt(sc.next()));
			
		}
		sc.close();
		List<Integer> list = getValues(map);
		
		System.out.println("******* Sorted List *******");
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
		
		
	}
	
	/**
	 * @param map
	 * This method will store values in HashMap to List and 
	 * @return sorted list of elements.
	 */
	public static List<Integer> getValues(HashMap<Integer, Integer> map){
		List<Integer> list1 = new ArrayList<Integer>();
		
		// add elements in list.
		for(HashMap.Entry<Integer, Integer> i:map.entrySet())
		{
			list1.add(i.getValue());
		//	System.out.println("Added :"+i.getValue());
		}
		
		//sort the list.
		Collections.sort(list1);

		return list1;
	}
}
