package com.ust.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInput {

	public static void main(String[] args) {
		try {
	/*		FileInputStream input= new FileInputStream("D:file2.txt");
			System.out.println("Data in the file : ");
			int i;// = input.read();
			while(( i =input.read())!=-1) {
				System.out.print((char)i);
		       // i =input.read();
				
			}
			input.close();*/
			String s="i need to write into the string";
			FileOutputStream output=new FileOutputStream("D:file2.txt");
			output.write(s.getBytes());
			output.close();
			
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		

	}

}
