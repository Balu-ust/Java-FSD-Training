package com.ust.example;

import java.io.File;

public class File3 {

	public static void main(String[] args) {
		// creates a file object
		File file= new File("C:\\Users\\ustjava16\\eclipse-workspace\\Practice\\bin\\com\\ust\\example");
		//returns an array of all files
		String[] fileList= file.list();
		
		for(String str : fileList) {
			System.out.println(str);
		}

	}

}
