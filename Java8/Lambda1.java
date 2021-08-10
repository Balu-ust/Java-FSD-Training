package com.ust.lam;

//this is functional interface
@FunctionalInterface
interface MyInterface{

 // abstract method
 double getPiValue();
}

public class Lambda1 {

 public static void main( String[] args ) {

 // declare a reference to MyInterface
 MyInterface ref;
 
 // lambda expression
 ref = () -> 3.1415;
 
 System.out.println("Value of Pi = " + ref.getPiValue());
 } 
}
