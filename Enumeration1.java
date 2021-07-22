package com.ust.example;

import java.util.Enumeration;
import java.util.Hashtable;

public class Enumeration1 {

	public static void main(String[] args) {
		Enumeration names;
		String key;
		//creating a Hashtable 
		
		Hashtable<String,String>hashtable = new Hashtable<String,String>();
		//adding key and value pairs to hashtable 
		
		hashtable.put("key1","balu");
		hashtable.put("key2","hari");
		hashtable.put("key3","dhanish");
		hashtable.put("key4","anand");
		hashtable.put("key5","sreehari");
		names= hashtable.keys();
		
		while(names.hasMoreElements()) {
			key=(String)names.nextElement();
			System.out.println("key: "+key+" & value: "+hashtable.get(key));
		}
		
		

	}

}
