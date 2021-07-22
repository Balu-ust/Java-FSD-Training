package com.ust.example;
class Base{
	final void display() {
		System.out.println("Base method is Called");
	}
}
class Derived extends Base {
/*	void display() {
		System.out.println("Base method is Called");
	
	}
*/}
public class FinalMethod {

	public static void main(String[] args) {
	
		Derived d= new Derived();
		d.display();

	}

}
