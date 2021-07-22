package com.ust.example;

public class LocalInner1 {
	private int data=30;
	void dipslay() {
		class Local{
			void msg() {
				System.out.println("data: "+data);
			}
		}
		Local l= new Local();
		l.msg();
	}

	public static void main(String[] args) {
		LocalInner1 li= new LocalInner1();
		li.dipslay();
		

	}

}
