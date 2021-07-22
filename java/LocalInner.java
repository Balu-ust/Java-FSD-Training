package com.ust.example;

public class LocalInner {
	private void outerMethod() {
		System.out.println("Inside outer method");
	
	class Inside{
		void innerMethod() {
			System.out.println("Inside Inner method");
		}
		
	}
	Inside y= new Inside();
	y.innerMethod();
	
}

	public static void main(String[] args) {
		
		LocalInner outer= new LocalInner();
		outer.outerMethod();
		
	}

}
