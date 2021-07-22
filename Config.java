package com.ust.example;

public class Config {
	final static String NAME="CONFIG";
	final long initTime;
	Config(){
		this.initTime=System.currentTimeMillis();
	}

	public static void main(String[] args) {
		Config c= new Config();
		System.out.println(c.initTime);
		Config c1= new Config();
		System.out.println(c1.initTime);
		

	}

}
