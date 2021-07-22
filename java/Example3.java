package com.ust.example;
/*
 * example of loops
 * 
 */
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	String[]  str= new String[5];
		
		String[] str = {"balu","hari","dhanish","anand","sreehari"};
		
		for(int i=0;i<str.length;i++) {
			
			if(str[i].equals("anand"))
				//break;
			continue;
			System.out.println(str[i]);
			
			
			
			
		}
		
		
		
	}

}
