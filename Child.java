package com.ust.example;

class Based{
	final void foo(int i) {
		System.out.println(i);
	}
	void foo( int i,String j) {
		
	}
	void display() {
		System.out.println("World");
	}
	
}


public class Child extends Based {
	void foo(int i, String s) {
		
		System.out.println(i+" "+s);
	}
/*	void foo(int i) {
		
}
*/
	public static void main(String[] args) {
		Child c= new Child();
	    c.foo(12, "balu");
	    c.display();
	    c.foo(25);

	//	System.out.println(c.foo(22,'T'));
		
	}

}
