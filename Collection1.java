package com.ust.example;

import java.util.ArrayList;
import java.util.Collections;

public class Collection1 {

	public static void main(String[] args) {
		ArrayList arr= new ArrayList();
		arr.add(5);
		arr.add(4.2f);
		arr.remove(1);
		arr.add("hello");
	//	System.out.println(arr);
		arr.add(2,"balu");
		
		System.out.println(arr);
		ArrayList<Integer> x= new ArrayList<Integer>();
		x.add(4);
		x.add(10);
		x.add(6);
		x.add(0);
		Collections.sort(x);
		System.out.println(x);
	//	int y= x.length();
		for(int i=0;i<x.size();i++) {
			if(x.get(i)==6) {
				System.out.println("its there");
				System.out.println("index is " + i);
			}
			
			
			
			
		}
	}

}
