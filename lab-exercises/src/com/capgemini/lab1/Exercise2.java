package com.capgemini.lab1;

import java.util.Scanner;

public class Exercise2 {
	private static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		
		System.out.println("1.Red\n2.Yellow\n3.Green\nEnter your choice :\n");
		int ch = sc.nextInt();
		switch(ch) {
		case 1: System.out.println("Stop");
			break;
		case 2: System.out.println("Ready");
		    break;
		case 3: System.out.println("Go");
		   break;
		 default : System.out.println("Invalid Choice");  
		}
	}
}
