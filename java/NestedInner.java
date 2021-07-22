package com.ust.example;

public class NestedInner {
	class Inner{
		public void show() {
			System.out.println("In a nested class");
		}
	}

	public static void main(String[] args) {
	
		NestedInner.Inner n1= new NestedInner().new Inner();
		n1.show();
		

	}

}
