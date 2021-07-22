package com.ust.example;

import java.util.Iterator;
import java.util.TreeSet;

public class CollectionTreeSet7 {

	public static void main(String[] args) {
		/*
		 * creating tree set and adding elements 
		 * 
		 */
		TreeSet<String>ts= new TreeSet<String>();
		ts.add("Geeks");
		ts.add("For");
		ts.add("Geeks help everthing");
		ts.add("Is");
		//ts.add(null);
		ts.add("Very helpfull");
		
		//transversing elements
		
		Iterator<String> itr= ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
