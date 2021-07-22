package com.ust.example;

import java.util.ArrayList;
import java.util.Collections;
import java.io.*;

class Student5 implements Comparable<Student5>{
	
	int rollno;
	String name;
	int age;
	
	Student5(int rollno, String name, int age){
		
		this.rollno= rollno;
		this.name= name;
		this.age= age;
	}


public int compareTo(Student5 st) {
	if(age==st.age)
		return 0;
	else if(age>st.age)
		return 1;
	else
		return -1;
	
}
}

public class Comparable1 {

	public static void main(String[] args) {
		
		
		ArrayList<Student5>ala= new ArrayList<Student5>();
		ala.add(new Student5(101,"balu",23));
		ala.add(new Student5(102,"hari",25));
		ala.add(new Student5(103,"anand",21));
		
Collections.sort(ala);
for(Student5 st:ala) {
	System.out.println(st.rollno+" "+st.name+" "+st.age);
}

	}

}
