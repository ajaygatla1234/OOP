package com.gl.inheritance;

class Employee {
	Employee(){
		System.out.println("From Employee");
	}
}

class Faculty extends Employee{
	Faculty(){
		System.out.println("From Faculty");
	}
}

class HOD extends Faculty{
	HOD(){
		System.out.println("From HOD");
	}
}

public class MultiLevel_Inheritance {

	public static void main(String[] args) {
		HOD obj = new HOD();
	}
	
	//The default super keyword present in every constructor will call the super class constructor
}
