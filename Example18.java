package com.ust.example;

public class Example18 {

	public static void main(String[] args) {
		double array[]= {10,30,40,70,50};
		double sum=0.0;
		double average= 0.0;
		
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
			
			
		}
		System.out.println("sum is:"+sum);
		
		average=sum/array.length;
		
		System.out.println("Average is:"+average);
		
	}

}
