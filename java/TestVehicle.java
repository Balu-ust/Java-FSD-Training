package com.ust.example;
/*
 * another abstract example
 * 
 * 
 */
abstract class Vehicle{
	int x=5;
	Vehicle(){
		System.out.println("Vehicle class constructor");
		
	}
//	abstract void run();
	
/*	final void changeGear() {
		System.out.println("Changing the  Gear");
	}
*/	
	void changeGear() {
		System.out.println("Changing the  Gear");
	}
	
	
	
}

class Honda extends Vehicle{
	void run() {
	System.out.println("vehicle is running");
}
	

/*	void changeGear1() {
		System.out.println("Changing the  Gear in sub class");
		super.changeGear();
	}
	
}
*/
void changeGear() {
	System.out.println("Changing the  Gear in sub class");
	super.changeGear();
}
}
public class TestVehicle {

	public static void main(String[] args) {
		Vehicle v = new Honda();
		
		System.out.println(v.x);
	//	v.run();
		v.changeGear();
		

	}

}
