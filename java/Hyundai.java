package com.ust.example;
//About abstract class
abstract class Car{
	abstract void insuranceDetails();
	void display() {
		
	}
}




public class Hyundai extends Car {
	void insuranceDetails() {
		System.out.println("Provide Insurance Formula");
	}

	public static void main(String[] args) {
	//	Car c= new Car();
		Hyundai h= new Hyundai();
	//	Hyundai h1= new Car();
		Car c= new  Hyundai();
		c.insuranceDetails();
		h.insuranceDetails();
		
	}

}
