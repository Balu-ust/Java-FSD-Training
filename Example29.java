package com.ust.example;


class Animal{
	String name;
	public void eat() {
		System.out.println("i can eat");
		
	}
}

class Dog extends Animal{
	
	public void display() {
		System.out.println("My name is:"+name);
		
	}
}



public class Example29 {

	public static void main(String[] args) {
		
		Dog labrador= new Dog();
		labrador.name= "arjun";
		labrador.display();
		labrador.eat();
		

	}

}
