package com.ust.example;
abstract class Person{
	abstract void eat();
	
}


public class AnonymousInner {

	public static void main(String[] args) {
		Person p = new Person() {
			void eat() {
				System.out.println("nice fruits");
			}
		};
		p.eat();
		
	}

}
