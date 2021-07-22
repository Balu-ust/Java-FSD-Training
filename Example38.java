package com.ust.example;

interface Emp2{
	int e_id=2201;
	void getE_Id();
	
}

public class Example38 {

	public static void main(String[] args) {
		Emp2 obj= new Emp2() {
		@Override
			public void getE_Id() {
			System.out.println("Employee id is " +e_id);
		}
		};
		obj.getE_Id();
		
		

	}

}
