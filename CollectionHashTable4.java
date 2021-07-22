package com.ust.example;

import java.util.Enumeration;
import java.util.Hashtable;
public class CollectionHashTable4 {

	public static void main(String[] args) {
		Hashtable ht= new Hashtable();
		ht.put("1","one");
		ht.put("2","two");
		ht.put("3","three");
		Enumeration e = ht.keys();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		

	}

}
