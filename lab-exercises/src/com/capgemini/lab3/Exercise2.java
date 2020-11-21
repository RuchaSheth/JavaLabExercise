package com.capgemini.lab3;

import java.util.Scanner;

public class Exercise2 {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter String :");
		String str= sc.next();
		String str1=getImage(str);
		System.out.println(str+"|"+str1);
	}
	private static String getImage(String str) {
		// TODO Auto-generated method stub
		StringBuffer bff=new StringBuffer(str);
		return bff.reverse().toString();
	}

}
