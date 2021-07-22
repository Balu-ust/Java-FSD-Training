package com.ust.example;

public class MyExplicitThrow {

	public static void main(String[] args) {
		try {
			MyExplicitThrow m = new MyExplicitThrow();
			System.out.println("length of the junk is "+m.getStringSize("JUNK"));
			System.out.println("length of the wrong is "+m.getStringSize("WRONG"));
			System.out.println("length of the null string is "+m.getStringSize(null));
		}
		catch(Exception e) {
			System.out.println("Exception message: "+e.getMessage());
			
		}
		

	}
	public int getStringSize(String str) throws Exception{
		if(str==null) {
			throw new Exception("String input is null");
		}
		else
		return str.length();
	}

}
