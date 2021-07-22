package com.ust.example;

public class Example19 {

	public static void main(String[] args) {
		int array[]= {4,6,8,15,14};
		int max=0;
		max=array[0];
		
		for(int i=1;i<array.length;i++) {
			
			if(max<array[i]) {
				max=array[i];
			}
			
		}
		System.out.println("Largest is:"+max);
	}

}
