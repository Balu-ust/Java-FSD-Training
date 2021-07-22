package com.ust.example;

class GenericsClass2 <T extends Number>{
	
	public void display(int data) {
		System.out.println("This is a bounded type generics class." +data);
		
	}
}


public class CollectionGenerics12 {

	public static void main(String[] args) {
		//create an object of generics class
		
		GenericsClass2<Integer> obj= new GenericsClass2<>();
		//obj.display();
		obj.<Integer>display(25);
	}
  
}
