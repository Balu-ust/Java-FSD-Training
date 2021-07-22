package com.ust.example;

enum Direction2{
	EAST("E"),WEST("W"),NORTH("N"),SOUTH("S") ;
	
	private final String shortCode;
	
	 Direction2(String code){
		this.shortCode= code;
	}
	public String getDirectionCode() {
		return this.shortCode;
	}
}

public class Enumeration5 {

	public static void main(String[] args) {
		Direction2 dir = Direction2.SOUTH;
		System.out.println(dir.getDirectionCode());
		
		Direction2 dir2= Direction2.EAST;
		System.out.println(dir2.getDirectionCode());
		
		

	}

}
