package com.ust.example;

public class Example26 {

	String name;
	int id;
	Float mark;
	
	 Example26(String a, int b){
		name=a;
		id=b;
		
	}
	Example26(String a,int b, float c){
		this(a,b);
		mark=c;
	}
	
	
	
	void disp() {
		System.out.println(name+" "+id+" "+mark);
	}
	
	public static void main(String[] args) {
		
		Example26 e1= new Example26("Hari",12);
		Example26 e2= new Example26("Balu",14,10.5f);
		
		e1.disp();
		e2.disp();
	}
	

}
