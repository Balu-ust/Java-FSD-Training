package com.ust.example;

public class CollectionGeneric10 {

	public static void main(String[] args) {
		
		/*
		 * initialise generic class with integer data 
		 * 
		 */
		
		GenericsClass<Integer> intObj= new GenericsClass<>(5);
		System.out.println("Generic class returns: "+ intObj.getData());
		
		//initialising generic class with string dATA
		
		GenericsClass<String> stringObj= new GenericsClass<>("java FSD");
		System.out.println("Generic class returns: "+ stringObj.getData());
		

	}

}

//create a generics class

class GenericsClass<T>{
	
	//variable of T type 
	private T data;
	
	public GenericsClass(T data) {
		this.data= data;
	}
	
	//method that return T type variable
	
	public T getData() {
		return this.data;
	}
}
