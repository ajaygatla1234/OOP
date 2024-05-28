package com.gl.exceptions;


class InvalidAgeException extends Exception{
	
	String message;
	
	public InvalidAgeException(String message) {
		this.message=message;
	}
	
}

class RecruitmentClass{
	
	public void checkAge(int age) throws InvalidAgeException {
		System.out.println("We are in Recruitment Process");
		System.out.println("About to Check Age");
		if(age<20||age>30) {
			throw new InvalidAgeException("Sorry Age Range is 20-30\n------------------------------------------------------------");
		}
		else {
			System.out.println(age+" is Valid Age...Proceed with Recruitment Process");
		}
		System.out.println("Age Security Over, You can Proceed with furthur Recruitment Process\n------------------------------------------------------");
	}
}

public class UserDefinedException {
	
	public void callCheckAge(int age) {
		try {
			RecruitmentClass obj = new RecruitmentClass();
			obj.checkAge(age);
		} catch (InvalidAgeException e) {
			System.err.println(e.message);
		}
	}

	public static void main(String[] args) {
		System.out.println("We have started Recruitment Process...");
		System.out.println("Checking Age");
		
		RecruitmentClass rc=new RecruitmentClass();
		
		try {
			rc.checkAge(21);
			rc.checkAge(25);
			rc.checkAge(45);
			rc.checkAge(23);
			rc.checkAge(9);
			rc.checkAge(25);
		} catch (InvalidAgeException e) {
			System.err.println(e.message);
		}
		
		System.out.println("============================================================");
		
		UserDefinedException obj=new UserDefinedException();
		obj.callCheckAge(21);
		obj.callCheckAge(25);
		obj.callCheckAge(45);
		obj.callCheckAge(23);
		obj.callCheckAge(9);
		obj.callCheckAge(25);
	
	}

}
