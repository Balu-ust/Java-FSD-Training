package com.ust.example;


abstract class Sum{
	public abstract int sumOfTwo(int n1, int n2);
	public abstract int sumOfThree(int n1, int n2,int n3);
	public void display() {
		System.out.println("Method of Class Sum");
	}
}


public class Demo extends Sum {
	public  int sumOfTwo(int num1, int num2) {
		return num1+num2;
	}
	public  int sumOfThree(int num1, int num2,int num3) {
		return num1+num2+num3;
	}

	public static void main(String[] args) {
		
		Sum obj = new Demo();
		System.out.println(obj.sumOfTwo(5, 8));
		System.out.println(obj.sumOfThree(2, 8, 7));
		obj.display();

	}

}
