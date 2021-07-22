package com.ust.example;

public class Exception3 {

	public static void main(String[] args) {
		try {
			int array[]= {2,5,7,9,12};
			System.out.println(array[7]);
		
	}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("the specified index does not exists"+"in array. Please correct the error");
		}

}
}
