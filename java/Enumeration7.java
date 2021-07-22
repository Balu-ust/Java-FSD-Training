package com.ust.example;

enum Operation{
	PLUS,
	MINUS,
	TIMES,
	DIVIDE;
	
	double calculate(double x, double y) {
		switch(this) {
		
		case PLUS:
			return x+y;
		case MINUS:
			return x-y;
		case TIMES:
			return x*y;
		case DIVIDE:
			return x/y;
		default:
			throw new AssertionError("Unknown operations "+this);
			
		}
			
	}
}

public class Enumeration7 {

	public static void main(String[] args) {
		
		Operation o1= Operation.DIVIDE;
		System.out.println(o1.calculate(10, 2));
		
		Operation o2= Operation.MINUS;
		System.out.println(o2.calculate(45, 20));

	}

}
