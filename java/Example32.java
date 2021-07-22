package com.ust.example;

class Calculation{
	int z;
	public void addition(int x, int y) {
		z=x+y;
		System.out.println("The sum of the given numbers:"+z);
		}
	public void subtraction(int x, int y) {
		z=x-y;
		System.out.println("The Difference of the given numbers:"+z);
		}
}



public class Example32 extends Calculation {

	public void multiplication(int x, int y) {
		z=x*y;
		System.out.println("The product of the given numbers:"+z);
		
		
	}
	public static void main(String[] args) {
		int a=5;
		int b=6;
		Example32 e1= new Example32();
		
e1.addition(a, b);
e1.subtraction(a, b);
e1.multiplication(a, b);	}

}
