package com.cg.lab8;

import java.io.*;

public class CopyDataThread extends Thread {
	
	FileReader input;
	FileWriter output;
	CopyDataThread(){
		
	}
	
	CopyDataThread(FileReader input,FileWriter output){
		this.input = input;
		this.output = output;
		
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		fileTransfer();
	}

	public void fileTransfer()
	{
		System.out.println("Data transfer started ... ");
		try {
			
			BufferedReader buffer = new BufferedReader(input);
			int ch;
			
			while((ch=buffer.read())!= -1) {
				
				if(ch%10==0)
				{
					System.out.println("\n10 characters are copied !");
					System.out.println("Thread is going to Sleep.....");
					Thread.sleep(5000);
					System.out.println("Thread started again ...");
					
				}
				Character c = (char) ch;
				output.write(c.toString());
				
			}
			System.out.println("\nFile Copied Successfully...!");
			buffer.close();
			output.close();
			
		} catch (IOException | InterruptedException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}


	
}
