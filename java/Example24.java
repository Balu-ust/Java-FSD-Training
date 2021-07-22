package com.ust.example;

class Student{
	
	String name;
	int id;
	Student(String name,int id){
		this.name=name;
		this.id=id;
	}
}




public class Example24 {

	
	
	public static void main(String[] args) {
		
		Student Student1= new Student("Balu",101);
		System.out.println("Student.name:"+Student1.name+" and Student Id:"+Student1.id);
		
		
		

	}

}
