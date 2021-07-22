package com.ust.example;

    abstract class Employ {
	private String name;
	private int paymentPerHour;
	
	void display() {
		System.out.println(name+" "+paymentPerHour);
	}
	public Employ() {
		
	}
	
	public Employ(String name, int paymentPerHour) {
		this.name=name;
		this.paymentPerHour=paymentPerHour;
		
	}
	
	//public abstract int calculatesalary();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
		
		
	}

	public int getPaymentPerHour() {
		return paymentPerHour;
	}
	
	public void setpaymentPerHour(int paymentPerHour) {
		this.paymentPerHour=paymentPerHour;
	}
	
	abstract void salary(int x, int y);
    }
	public class Employeee extends Employ{
		Employeee(){
			super();
		}
		
		Employeee(String name,int paymentPerHour){
			super(name,paymentPerHour);
		}
		
		void salary(int day, int total) {
			if((total/day)>500) {
				System.out.println("good");
			}
			
			else {
				System.out.println("not good");
			}
		}
	
	public static void main(String[] args) {
		
		
		Employeee e1 = new Employeee("balu",22);
		e1.display();
		Employeee e2 = new Employeee();
		e2.setName("Kannan");
		System.out.println(e2.getName());
		e2.salary(20,20000);
		
	
		
}
}
