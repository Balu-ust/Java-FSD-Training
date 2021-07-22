package com.ust.example;
/*
 * upcasting/downcasting
 * 
 */
public class Cast {

	public static void main(String[] args) {
		double num=16.945;
		System.out.println(num);
		int n =(int)num;
		System.out.println(n);
		int x=15;
		double y=x;
		System.out.println(y);
		float f =(float)3.12;
		byte d = (byte)f;
		System.out.println(d);
		long e=1254;
		float g=e;
		System.out.println(g);
		
		int c= 120;
		String dbValue= String.valueOf(c);
		System.out.println(dbValue);
		dbValue= String.valueOf(e);
		System.out.println(dbValue);
		
	

	}

}
