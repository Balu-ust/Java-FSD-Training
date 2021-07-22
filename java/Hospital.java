package com.ust.example;

class Patient{
	private String name;
	private int age;
	private boolean vaccination;
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
	public boolean isVaccination() {
		return vaccination;
	}
	public void setVaccination(boolean vaccination) {
		this.vaccination = vaccination;
		
		if(vaccination==true) {
			System.out.println("Vaccination done");
			
		}
		else {
			System.out.println("Vaccination not done");
			
		}
	}
	
	
}

public class Hospital {

	public static void main(String[] args) {
		

		Patient p= new Patient();
		p.setName("Balu");
		p.setAge(24);
		p.setVaccination(false);
		
		
		System.out.println(p.getName()+" "+p.getAge()+" "+p.isVaccination());
	}

}
