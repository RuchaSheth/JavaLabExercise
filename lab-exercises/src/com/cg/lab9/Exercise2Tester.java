package com.cg.lab9;

import java.util.Scanner;

public class Exercise2Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter String :");
		String str = sc.nextLine();

		
		Exercise2 exercise2 = 
				(String str1)->{
					return changedString(str1);
					};
					
		System.out.println("String with Spaces:\n"+exercise2.addSpace(str));
				
		
		sc.close();
	}

	
	public static String changedString(String str1) {
		StringBuilder sb =  new StringBuilder();
			for(int i=0;i<str1.length();i++)
			{
				sb=sb.append(str1.charAt(i));
				if(i==str1.length()-1)
					break;
				sb= sb.append(" ");
			}
			return sb.toString();
	}

}
