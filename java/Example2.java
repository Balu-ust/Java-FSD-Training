package com.ust.example;
/*Depicting the use of
 * condition statements
 * 
 * 
 * 
 */
public class Example2 {

	Float price;
	String item;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Example2 e1 = new Example2();
	Example2 e2 = new Example2();
	
	e1.price= 2.5f;
	e2.price= 3.5f;
	e1.item= "eraser";
	e2.item="book";
	
	if(e1.price>e2.price) {
		e1.item="scale";
		
	}
	
	if(e1.price<e2.price) {
		
		e1.item="pencil";
	}
		
	else if (e1.price== e2.price) {
		e1.item="box";
	}
		
	System.out.println(e1.item);
	}
	

}
