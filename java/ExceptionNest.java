package com.ust.example;

public class ExceptionNest {

	public static void main(String[] args) {
		//parent ttry block
		try {
			//child try block
			try {
				System.out.println("Inside block 1");
				int b=45/0;
				System.out.println(b);
			}
			catch(ArithmeticException e1) {
				System.out.println("Exception : e1");
			}
			// child try block 2
			try {
				System.out.println("Inside block 2");
				int b=45/0;
				System.out.println(b);
			}
			catch(ArrayIndexOutOfBoundsException e2) {
				System.out.println("Exception : e2");
			}
			System.out.println("just oter statement");
		}
		catch(ArithmeticException e3) {
			System.out.println("Arithmetic Exception");
			System.out.println("Inside parent try catch block");
		}
		catch(ArrayIndexOutOfBoundsException e4) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("Inside parents try catch block");
		}
		catch(Exception e5) {
			System.out.println("Exception");
			System.out.println("Inside parent try catch block");
		}
		System.out.println("Next statement....");

	}

}
