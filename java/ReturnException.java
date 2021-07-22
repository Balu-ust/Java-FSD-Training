package com.ust.example;

public class ReturnException {
	
	@SuppressWarnings("finally")
	public static int returnTest(int number) {
		try {
			if(number%2==0)
				throw new Exception("Exception thrown");
			else 
				return 5;
		}
		catch(Exception e) {
			return 3;
		}
		finally {
			return 7;
		}
	}

	public static void main(String[] args) {
		System.out.println(returnTest(2));
		

	}

}
