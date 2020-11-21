package com.capgemini.lab3;

import java.util.Scanner;

public class Exercise4 {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Number: ");
		Integer num = sc.nextInt();
		System.out.println("Modified Number is : "+modifiyNumber(num));
	}
	
	public static int modifiyNumber(int num){
		String str = String.valueOf(num);
		StringBuffer strBuff = new StringBuffer(); 
		int diff=0;
		for(int i=0;i<str.length()-1;i++)
		{
			diff=Math.abs((int)(str.charAt(i)-str.charAt(i+1)));
			strBuff.append(diff);
		}
		strBuff.append(str.charAt(str.length()-1));
	return Integer.parseInt(strBuff.toString());
	}

}
