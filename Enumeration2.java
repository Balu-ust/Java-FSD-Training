package com.ust.example;

public class Enumeration2 {

	enum CovidWaves{
		Wave1,Wave2,Wave3;
		
		
	}
	public static void main(String[] args) {
		CovidWaves c= CovidWaves.Wave1;
		

		System.out.println(c);
		
		for(CovidWaves l:CovidWaves.values()) {
			System.out.println(l.name());
		}
	}
	

}
