package com.ust.example;
interface Polygon{
	void getArea(int length,int breadth);
	
	//
}
class Rectangle implements Polygon{
	public void getArea(int length, int breadth) {
		System.out.println("the area of rectangle= "+(length*breadth));
	}
}
interface Polygon1{
	void getSArea(int side);
}
class Square implements Polygon1{
	public void getSArea(int side) {
		System.out.println("the area of square= "+(side*side));
	}
}
public class Example42 {

	public static void main(String[] args) {
		Rectangle r= new Rectangle();
		r.getArea(5, 6);
		
		Square s= new Square();
		s.getSArea(8);

	}

}
