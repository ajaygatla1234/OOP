package com.gl.inheritance;

class Employee {
	int empId;
	Employee(int empId){
		this.empId=empId;
	}
	
	public int getEmpId() {
		return empId;
	}
}

class Faculty extends Employee{
	Faculty(int empId){
		super(empId);
	}
}

class HOD extends Employee{
	HOD(int empId){
		super(empId);
	}
}

class Admin extends Employee{
	Admin(int empId){
		super(empId);
	}
}

public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		Faculty obj1=new Faculty(1);
		System.out.println(obj1.getEmpId());
		
		HOD obj2=new HOD(2);
		System.out.println(obj2.getEmpId());
		
		Admin obj3=new Admin(3);
		System.out.println(obj3.getEmpId());
	}
}
