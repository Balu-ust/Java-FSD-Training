package com.ust.example;

interface Emp{
	int e_id=2101;
	void getE_Id();
}
class Lmpl  implements Emp{
	@Override
	public void getE_Id() {
		System.out.println("employee id is "+e_id);
	}
}


public class Example37 {

	public static void main(String[] args) {
	
		Lmpl obj= new Lmpl();
		obj.getE_Id();

	}

}
