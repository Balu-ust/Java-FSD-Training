package com.ust.example;

public class Exception1 {

	public static void main(String[] args) {
		try {
			//code generate exceptionss
			int divideByZero =5/0;
			
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception==>"+ e.getMessage());
		}
		finally {
			System.out.println("It is the final block");
		}
		
	}

}
