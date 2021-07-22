package com.ust.example;

import java.io.FileReader;

public class File1 {

	public static void main(String[] args) {
		char[] array= new char[6];
		
		
		try {
			//creates a reader using filereader
			FileReader input= new FileReader("D:file2.txt");
			
			//read characters
			input.read(array);
			System.out.println("Data in the file: ");
			System.out.println(array);
			input.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		

	}

}
