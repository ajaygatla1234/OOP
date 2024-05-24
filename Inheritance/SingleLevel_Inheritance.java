package com.gl.inheritance;

class Employee{
	
	String name;
	int code;
	
//	public Employee() {  //this is for implicitly calling using super() keyword
//		
//	}
	
	public Employee(String name, int code) {
		this.name = name;
		this.code = code;
	}
}

class Faculty extends Employee{

	String dept;

	public Faculty(String name, int code, String dept) {
		super(name, code); //Explicitly calling the superclass constructor
		this.dept=dept;
	}
	
	//or
	
//	public Faculty(String name, int code, String dept) {
//		//The "super()" keyword is present by default, even if we do not declare it.
//	     This implicitly calls Employee()
//		this.name=name;
//		this.code=code;
//		this.dept=dept;
//	}

	public void display() {
		System.out.println("Name : "+name+"\nCode : "+code+"\nDepartment : "+dept);
	}
}

public class SingleLevel_Inheritance {
	
	public static void main(String[] args) {
		
		Faculty obj=new Faculty("John", 1, "Physics");
		obj.display();
	}
	
}
