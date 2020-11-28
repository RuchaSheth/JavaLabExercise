package com.cg.lab10;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileTester {
	private static Scanner sc = new Scanner(System.in);
	  public static void main(String rr[])throws IOException
    {
        FileDetails file=new FileDetails();
        
//        System.out.println("Enter File Name:");
//		  String fn = sc.next();
		  File f = new File("C://Users//Rucha//Desktop//source.txt"); 
		  file.displayFileDetails(f);
		  
		 
    }
}
