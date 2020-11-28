package com.cg.lab10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise1 {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("C://Users//Rucha//Desktop//source.txt");
		 BufferedReader buffer = new BufferedReader(reader);
		 String line;
		 int lineNumber=1;
		 while ((line = buffer.readLine()) != null) {
		  //display lines in file with line number	 
		   System.out.println(lineNumber+"] "+line); 
		   lineNumber++;
		 }
		 buffer.close();
	}
		 
}
