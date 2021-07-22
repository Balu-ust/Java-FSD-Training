package com.ust.example;
enum Directions1{
	EAST,WEST,NORTH,SOUTH;
}

public class Enumeration4 {
	Directions1 dir;
	public Enumeration4(Directions1 dir) {
		this.dir= dir;
		
	}
	
	public void getMyDirection() {
		switch(dir) {
		case EAST :
			System.out.println("in east direction");
			break;
			
		case WEST :
			System.out.println("in west direction");
			break;
			
		case NORTH :
			System.out.println("in north direction");
			break;
			
		default :
			System.out.println("in South direction");
			break;
		
			
		}
	}

	public static void main(String[] args) {
		Enumeration4 obj1= new Enumeration4(Directions1.EAST);
		obj1.getMyDirection();
		Enumeration4 obj2= new Enumeration4(Directions1.SOUTH);
		obj2.getMyDirection();

	}

}
