package com.cg.lab8;

import java.io.*;

public class CopyDataThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileReader iFile = new FileReader("C:\\Users\\Rucha\\Desktop\\source.txt");
			FileWriter oFile = new FileWriter ("C:\\Users\\Rucha\\Desktop\\target.txt"); 
			
			Thread copy =  new CopyDataThread(iFile,oFile);
			
			copy.start();		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
