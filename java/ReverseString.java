package com.ust.example;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String Original;
		String Reverse="";
		Scanner sct= new Scanner(System.in);
		System.out.println("enter string to reverse  ");
		Original= sct.nextLine();
		int length= Original.length();
		for(int i=length-1;i>=0;i--) {
			Reverse=Reverse+Original.charAt(i);
			
		}
		System.out.println("reverse of entered string is "+Reverse);

	}

}
