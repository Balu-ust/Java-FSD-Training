package com.ust.example;

 class Vehicle1{
	int x=5;
	Vehicle1(){
		System.out.println("Vehicle class constructor");
		
	}
	
	final void changeGear() {
		System.out.println("Changing the  Gear");
	}
	
	
	
}

class Honda1 extends Vehicle1{
	void run() {
	System.out.println("vehicle is running");
}
	void changeGear1() {
		System.out.println("Changing the  Gear in sub class");
		super.changeGear();
	}
	
}

public class TestFinal {

	public static void main(String[] args) {
		Vehicle1 v = new Honda1();
		System.out.println(v.x);
		
		v.changeGear();
		

	}

}
