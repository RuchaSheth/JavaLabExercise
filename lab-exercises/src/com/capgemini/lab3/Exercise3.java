package com.capgemini.lab3;

import java.util.Scanner;

public class Exercise3 {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter String :");
		String str = sc.next();
		System.out.println(alterString(str));
	}
	
	/**
	 * @param str
	 * @return returns String by replacing Consonants with
	 * immediate next alphabet
	 */
	private static String alterString(String str) {
		char [] str1 = str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			
			if((str1[i]!='a')||(str1[i]!='A')||
					(str1[i]!='e')||(str1[i]!='E')||
					(str1[i]!='i')||(str1[i]!='I')||
					(str1[i]!='o')||(str1[i]!='O')||
					(str1[i]!='u')||(str1[i]!='U'))
			{
				if(str1[i]=='z')
				{
					str1[i]='b';
				}
				else if(str1[i]=='Z')
				{
					str1[i]='B';
				}
				else
				str1[i]=(char)(str1[i]+1);
			}
			
		}
		return String.valueOf(str1);
	}

}
