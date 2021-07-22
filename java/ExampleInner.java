package com.ust.example;
/*
 * exmaple of inner class
 * 
 * 
 */

public class ExampleInner {
	 int x=5;
void display() {
	System.out.println("outer class");
	}

	
	 class Inner{
		private int y;
		
		Inner(int y){
			ExampleInner.this.x=5;
			this.y=y;
		}
		void display(){
		System.out.println("inner class");
	}
	
}
	
	
	public static void main(String[] args) {
		
		ExampleInner.Inner ei = new ExampleInner().new Inner(6);
		ei.display();

		ExampleInner e1= new ExampleInner();
		e1.display();
		e1.x=5;
		System.out.println(e1.x);
	}

}
