package com.ust.example;
/*
 * Example Exception
 * 
 */
public class ExampleException {

	public static void main(String[] args) {
	String s=null;
	//int x=5/0;
	
	try {
		try {
			System.out.println(s.length());
		}
		catch(NullPointerException e) {
			e.printStackTrace();
			
		}
		finally {
			System.out.println("This code gets executed always");
		}
		int a[]= new int[5];
		a[5]=10;
		
	}
	catch(ArrayIndexOutOfBoundsException e ){
		System.out.println("occured");
		e.printStackTrace();
	}

	}

}
