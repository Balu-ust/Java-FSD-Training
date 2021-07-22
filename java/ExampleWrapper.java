package com.ust.example;

public class ExampleWrapper {

	public static void main(String[] args) {
		int i=5;
		Integer obj = new Integer(i);
		
		//wrapping
		int j= obj.intValue();
		System.out.println(j);
		//unwrapping
		double d= 10;
		Double obj1= new Double(d);
		
		//wrapping
		Double dd= obj1.doubleValue();
		System.out.println(dd);

	}

}
