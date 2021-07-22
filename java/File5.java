package com.ust.example;

import java.io.IOException;
import java.io.StringReader;

public class File5 {

	public static void main(String[] args) {
		String str= "Heloo world \nThis is StringReader program";
		StringReader sr= new StringReader(str);
		int i=0;
		try {
			while((i=sr.read())!=-1) {
				System.out.print((char)i);
			}
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
