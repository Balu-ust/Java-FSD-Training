package com.ust.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;



 class NameComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Student444 s1=(Student444)o1;
		Student444 s2= (Student444)o2;
		return s1.name.compareTo(s2.name);
	}
 }
 
/* class AgeComparator implements Comparator{
	 public int compare(Object o1, Object o2) {
			Student44 s1=(Student44)o1;
			Student44 s2= (Student44)o2;
			
			if(s1.age==s2.age)
				return 0;
			else if(s1.age>s2.age)
				return 1;
			else
				return -1;
			
			
 }*/
	
	public class Comparator1 {
	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add(new Student444(101,"salu",23));
		al.add(new Student444(102,"hari",24));
		al.add(new Student444(103,"dhanish",25));
		
		
		System.out.println("Sorting by name");
		Collections.sort(al,new NameComparator());
		
	
		
		Iterator itr= (Iterator) al.iterator();
		
		
		while(itr.hasNext()) {
			Student444 st=(Student444)itr.next();
			
			System.out.println(st.rollno+" "+st.name+" "+st.age);
					
					
			
		}
		
		
		
		
		

	}

}

class Student444{
	int rollno;
	String name;
	int age;
	Student444(int rollno,String name,int age){
		this.rollno=rollno;
		this.name= name;
		this.age= age;
		
	}
}

