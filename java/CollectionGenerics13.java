package com.ust.example;

import java.util.ArrayList;
import java.util.List;

public class CollectionGenerics13 {

	public static void main(String[] args) {
		
		List<Integer> ints= new ArrayList<>();
		ints.add(8);
		ints.add(5);
		ints.add(10);
		double sum= sum(ints);
		
		System.out.println("Sum of ints is : "+sum);
		
		
	}
	public static double sum(List<? extends Number> list) {
		double sum=0;
		for(Number n:list) {
			sum += n.doubleValue();
		}
		return sum;
	}

}
