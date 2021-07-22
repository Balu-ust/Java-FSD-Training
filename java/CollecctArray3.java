package com.ust.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollecctArray3 {

	public static void main(String[] args) {
		List list =  Arrays.asList("one two three four five six seven one four".split(" "));
		System.out.println("List :"+list);
		
		List sublist= Arrays.asList("three four".split(" "));
		System.out.println("Sublist :"+sublist);
		System.out.println("IndexOfSublist: "+ Collections.indexOfSubList(list, sublist));
		System.out.println("LastIndexOfSublist :"+ Collections.lastIndexOfSubList(list, sublist));
		

	}

}
