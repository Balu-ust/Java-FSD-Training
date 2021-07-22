package com.ust.example;

abstract class Zoo {
	abstract void makeSound();
}

class Dogg extends Zoo {
	
	//implementation of abstract method 
	public void makeSound() {
		System.out.println("Bark bark");
	}
}

class Cat extends Zoo{
	public void makeSound() {
		System.out.println("meow meow");
	}
}


public class Example34 {

	public static void main(String[] args) {
		Dogg d1= new Dogg();
		d1.makeSound();
		
		Cat c1 = new Cat();
		c1.makeSound();

	}

}
