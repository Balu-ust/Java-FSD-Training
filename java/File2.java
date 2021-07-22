package com.ust.example;

import java.io.File;

public class File2 {

	public static void main(String[] args) {
		File file = new File("D:file4.txt");
		//create  a file
		try {
			file.createNewFile();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		//create an object that contains the new name of file
		File newFile = new File("D:java2.txt");
		
		//change the name of file 
		boolean value = file.renameTo(newFile);
		
		if(value) {
			System.out.println("The name of the file is changed.");
		}
		else {
			System.out.println("The name cannot be changed.");
			
		}

	}

}
