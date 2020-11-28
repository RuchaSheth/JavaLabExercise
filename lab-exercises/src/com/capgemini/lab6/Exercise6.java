package com.capgemini.lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Persons:");
		int num = sc.nextInt();
		
		Map<Integer,Integer> voter = new HashMap<>();
		
		System.out.println("Enter VoterId and Age of each Voter");
		int age,id;
		for(int i=0;i<num;i++)
		{
			id = sc.nextInt();
			age = sc.nextInt();
			voter.put(id, age);
		}
		List<Integer> voterList = votersList(voter);
		System.out.println("Eligible Persons for Voting are : ");
		for(int i=0;i<voterList.size();i++)
			System.out.println(voterList.get(i));
		sc.close();
	}

	/**
	 * @param voter
	 * @return list of voters eligible for voting.
	 * (if age >= 18) then person is eligible for voting. 
	 */
	private static List<Integer> votersList(Map<Integer, Integer> voter) {
		// TODO Auto-generated method stub
		List <Integer> voterList = new ArrayList<>();
		for(Map.Entry<Integer,Integer> i:voter.entrySet())
		{
			if(i.getValue()>=18)
				voterList.add(i.getKey());
		}
		
		Collections.sort(voterList);
		return voterList;
	}

}
