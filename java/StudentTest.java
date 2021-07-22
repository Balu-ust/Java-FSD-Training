package com.ust.example;

 class StudentNotFoundException extends Exception {
	public StudentNotFoundException(String message) {
		super(message);
	}
}
class student3{
	student3(){
		
	}
	
}
	 class StudentManager{
		public student3 find(String studentID)throws StudentNotFoundException{
			if(studentID.equals("123456")) {
				System.out.println("found");
				return new student3();
			}
			else {
				throw new StudentNotFoundException("Could not find student with ID "+ studentID);
			}
		
	}
	 }
	public class StudentTest{

	public static void main(String[] args) {
		StudentManager manager= new StudentManager();
		try {
			student3 student = manager.find("000001");
		}
		catch(StudentNotFoundException e2) {
			System.err.print(e2);
		}
		
	}
	
		

	}


