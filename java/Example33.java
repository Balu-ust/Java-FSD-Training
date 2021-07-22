package com.ust.example;

class Super_class{
	int num =20;
	 public void display() {
		 System.out.println("This is the display method of superclass");
		
	}
}



public class Example33 extends Super_class {
	int num=10;
	public void display() {
		 System.out.println("This is the display method of sub class");
	}
	
	public void my_method() {
		Example33 sub= new Example33();
		sub.display();
		super.display();
		System.out.println("Variable name num in sub class is"+sub.num);
		System.out.println("Variable name num in Super class is"+super.num);
		
	}

	public static void main(String[] args) {
	
		Example33 obj= new Example33();
		obj.my_method();
		

	}

}
