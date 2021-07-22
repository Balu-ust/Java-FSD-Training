package com.ust.example;
interface Animal1{
	public void animalsound();
	public void sleep();
	
}
class Pig implements Animal1{
	public void animalsound() {
		System.out.println("the pig says :wee wee");
	}
	public void sleep() {
		System.out.println("Zzz");
	}
}
public class Example39 {

	public static void main(String[] args) {
		Pig p= new Pig();
		p.animalsound();
		p.sleep();
		

	}

}
