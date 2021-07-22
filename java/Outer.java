package com.ust.example;

public class Outer {
	private void getValue() {
		int sum=25;
		
		class Inner{
			public int divisor;
			public int remainder;
			
			public Inner() {
				divisor=3;
				remainder=sum%divisor;
				
			}
			private int getDivisor() {
				return divisor;
			}
			private int getRemainder() {
				return sum%divisor;
			}
			private int getQuotient() {
				System.out.println("inside inner class");
				return sum/divisor;
			}
		}
		Inner inner= new Inner();
		System.out.println("Divisor = "+inner.getDivisor());
		System.out.println("Remainder = "+inner.getRemainder());
		System.out.println("Quotient = "+inner.getQuotient());
		
	}

	public static void main(String[] args) {
		Outer outer= new Outer();
		outer.getValue();

	}

}
