package com.ust.example;
public class Example27{

	private int accountNo;
	private String accountName;
	 float accountBalance;
	
	
	void printbankdetails() {
		System.out.println(accountNo+" "+accountName+" "+accountBalance);
	}
	void insertBankData(int x, String y, float z) {
		accountNo=x;
		accountName=y;
		accountBalance=z;
		
	}	

	
	
	
	public static void main(String[] args) {
		
		Example27 e1= new Example27();
		e1.insertBankData(1122,"Balu",17000);
		//System.out.println(e1.accountBalance);
e1.printbankdetails();
	}
 
}
