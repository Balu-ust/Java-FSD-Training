package com.ust.example;
/*
 * 
 * example how to find the string ending with specified word
 * 
 */
public class Example16 {

	public static void main(String[] args) {
		// declare the original string
		String string="Hello Word";
		
		if(string.endsWith("World")) {
			System.out.println("String ends with world");
		}
		else {
			System.out.println("String does not ends with world");
		}

	}

}
