package com.ust.example;
/*
 * encapsulation
 * 
 * 
 */
class TestData{
	private String name;
	private int age;
	private float salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}
public class TestDataHiding {

	public static void main(String[] args) {
		

		TestData t= new TestData();
		t.setName("Balu");
		t.setAge(25);
		t.setSalary(25000);
		System.out.println(t.getName()+" "+t.getAge()+" "+t.getSalary());
	}

}
