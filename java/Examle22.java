package com.ust.example;

public class Examle22 {

	String fName;
	String lName;
	String city;
	String address;
	String dob;
	float salary;
	
	Examle22 (String a, String b, String c, String d,String e,float f){
		fName=a;
		lName=b;
		city=c;
		address=d;
		dob=e;
		salary=f;
	}
	
	void display(){
		System.out.println(fName+" "+lName+" "+city+" "+address+" "+dob+" "+salary);
	}
	public static void main(String[] args) {
	
		Examle22 e1 = new Examle22("Balu","G K","Kayamkulam","no.2","14 feb 97",10000);
		Examle22 e2 = new Examle22("Hari","A R","Palakkad","no.3","02 jan 97", 15000);
        Examle22 e3 = new Examle22("Anand"," C K","Calicut","no.4","22 aug 98",17000);
        Examle22 e4 = new Examle22("Sreehari"," H I","Trissur","no.5","11 dec 98",25500);
        Examle22 e5 = new Examle22("Dhanish"," P G","Pattambi","no.5","07 nov 98",12000);
	
        Examle22 array[]= new Examle22[5];
        
        array[0]= new Examle22("Balu","G K","Kayamkulam","no.2","14 feb 97",10000);
        array[1]= new Examle22("Hari","A R","Palakkad","no.3","02 jan 97", 15000);
        array[2]= new Examle22("Anand"," C K","Calicut","no.4","22 aug 98",17000);
        array[3]=new Examle22("Sreehari"," H I","Trissur","no.5","11 dec 98",25500);
        array[4]=new Examle22("Dhanish"," P G","Pattambi","no.5","07 nov 98",12000);
    for(int i=0;i<array.length;i++) {
    	array[i].display();
    }
        
    /*    for(Examle22 e:array) {
      //  	System.out.println(e.fName+" "+e.lName+" "+e.city+" "+e.address+" "+e.dob+" "+e.salary);
       
        	e.display();
        }
        
        
       /* for(int i=1;i<5;i++) {
        	
        	e1.display();
        /*}
        
     /*   e1.display();
		e2.display();
		e3.display();
		e4.display();
		e5.display();
	*/	
		}

}
