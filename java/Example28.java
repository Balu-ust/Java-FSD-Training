package com.ust.example;



class Creditcard {

	String cardName;
	String expiryDate;
	float creditBalance;

void checkCardBalance() {
	if
	(creditBalance>10000) {
		System.out.println("sufficient balance");
	}
	else {
		System.out.println("not sufficient balance");
	}
}
}
class Visacard extends Creditcard{
	float interestRate;
	int creditLimit;
	
	
}






public class Example28 {

	public static void main(String[] args) {
		Visacard v1 = new Visacard();
		v1.cardName="visa";
		v1.expiryDate="12/02/2022";
		v1.interestRate=4.15f;
		v1.creditBalance=15000.5f;
		v1.checkCardBalance();

		System.out.println(v1.cardName+"\n "+v1.expiryDate+"\n"+v1.interestRate);
	}

}
