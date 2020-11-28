package com.cg.lab10;

import java.io.File;

public class FileDetails {

	public void displayFileDetails(File file)
	{

		if(file.exists())
		{
			System.out.println("File Name : "+file.getName());
			System.out.println(file.canRead()?"File is readable":" File is not readable");
			System.out.println(file.canWrite()?"File is writable":" File is not writable");
			System.out.println("File Size (in bytes) : "+file.length());
			System.out.println("File last mdified : "+file.lastModified());

		}

	}
}
