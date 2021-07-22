package com.ust.example;

import java.net.MalformedURLException;
import java.net.URL;

public class MyTryBlockOnly {

	public static void main(String a[]  ) throws MalformedURLException{
		try {
			URL url = new URL("http://www.google.com");
		//	System.out.println("hello");
		}
		
		
		finally {
			System.out.println("in finally block");
		}
		
		

	}

}
