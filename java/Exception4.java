package com.ust.example;

import java.io.IOException;

class ThrowExample{
	void myMethod(int num)throws IOException,ClassNotFoundException{
		if(num==1) {
			throw new IOException("IOException occured");
		}
		else {
			throw new ClassNotFoundException("ClassNotFoundException");
		}
	}
}

public class Exception4 {

	public static void main(String[] args) {
		try {
			ThrowExample obj= new ThrowExample();
			obj.myMethod(2);
		}
		catch(Exception e) {
			System.out.println(e);
			//System.out.println("hi");
		}
		
		finally {
			System.out.println("hello");
		}
		
		

	}

}
