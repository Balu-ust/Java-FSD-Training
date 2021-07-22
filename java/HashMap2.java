package com.ust.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashMap2 {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> hm= new LinkedHashMap<Integer,String>();
		
		hm.put(3,"hello");
		hm.put(2,"how are");
		hm.put(1,"you all");
		
		for(Map.Entry<Integer, String> mapElement : hm.entrySet()) {
			
			Integer key= mapElement.getKey();
			
			//finding the value
			
			String value= mapElement.getValue();
			
			//print key value pair
			
			System.out.println(key +" : "+ value);
					
		
		
		}

	}

}
