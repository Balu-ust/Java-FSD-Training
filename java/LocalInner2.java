package com.ust.example;

public class LocalInner2 {
	private int data=30;
	void display() {
		int value=50;
		class Local{
			void msg() {
				System.out.println("value: "+value+" Data: "+data);
			}
		}
		Local l= new Local();
		l.msg();
	}

	public static void main(String[] args) {
		LocalInner2 l1= new LocalInner2();
		l1.display();
		

	}

}
