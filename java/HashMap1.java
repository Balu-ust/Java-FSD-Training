package com.ust.example;

import java.util.LinkedHashMap;

public class HashMap1 {

	public static void main(String[] args) {
		//initialisation
		
		LinkedHashMap<Integer,String>  hm= new LinkedHashMap<Integer,String>();
		//add mapping
		
		hm.put(3,"java");
		hm.put(2,"fsd");
		hm.put(1,"training");
		
		
		//print map console
		
		System.out.println("mapping of linkedhashmap : "+hm);
		

	}

}
