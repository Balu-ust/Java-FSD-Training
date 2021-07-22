package com.ust.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File1Example {

	public static void main(String[] args) {
		try {
		File fName= new File("D:file1.txt");
		
		if(fName.createNewFile()) {
			System.out.println("file is created");
			
		}
		else {
			System.out.println("file already exits");
		}
		System.out.println(fName.canRead());
		System.out.println(fName.canWrite());
		System.err.println("hello ");
		Scanner sc= new Scanner(System.in);
		String txt= sc.nextLine();
		System.out.println("The name is "+txt);
		
		
		fName.setReadable(false);
		fName.setWritable(false);
		fName.setWritable(false, false);
		
	//	fName.write("i am back");
		
	//	fName.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
