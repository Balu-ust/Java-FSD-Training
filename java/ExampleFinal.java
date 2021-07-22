package com.ust.example;
/*
 * 
 * 
 * final variable final class
 * 
 */
public class ExampleFinal {

	int a;
    final int b;
	
	ExampleFinal(){
		a=7;
		b=2;
		
	}
	
	
	
	
	
	public static void main(String[] args) {

		final int x;
		x=10;
		System.out.println(x);
		
		ExampleFinal ef= new ExampleFinal();
		System.out.println(ef.a);
		System.out.println(ef.b);
		ef.a=13;
		
		System.out.println(ef.a);

	}

}
