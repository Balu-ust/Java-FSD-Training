package com.ust.example;



public class StaticNested {
	
	static class Nested{
		public void my_Method() {
			System.out.println("This is my nested class");
		}
		
	}

	public static void main(String[] args) {
		StaticNested.Nested nested= new StaticNested.Nested();
		
		nested.my_Method();
	
	
	}

}
