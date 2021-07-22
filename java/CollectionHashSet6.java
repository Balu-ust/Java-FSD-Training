package com.ust.example;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionHashSet6 {

	public static void main(String[] args) {
		//Creating hashset and
		//adding elements
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Geeks");
		hs.add("For");
		hs.add("Geeks help everthing");
		hs.add("Is");
		hs.add(null);
		hs.add("Very helpfull");
		
		
		//transversing elements
		Iterator<String> itr= hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	}

}
