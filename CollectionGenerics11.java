package com.ust.example;

class GenericClass{
	//create generics method
	
	public<T> void genericMethod(T data) {
		System.out.println("Generic Method");
		System.out.println("data passed : "+data);
		
	}
}



public class CollectionGenerics11 {

	public static void main(String[] args) {
		//initialize the class with integer data
		GenericClass gc= new GenericClass();
		
		
		//generic method working with string
		
		gc.<String>genericMethod("java FSD");
		
		//generics method working with integer
		
		gc.<Integer>genericMethod(25);
		

	}

}
