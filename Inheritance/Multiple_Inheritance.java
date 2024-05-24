package com.gl.inheritance;

interface InterfaceA{
	
	void run1();
	
	default void run3() {
		System.out.println("From InterfaceA Default method");
	}	
}

interface InterfaceB{
	void run2();
}

class ClassA implements InterfaceA,InterfaceB{
	
	static int i;

	@Override
	public void run1() {
		System.out.println("From Interface 1");
	}

	@Override
	public void run2() {
		System.out.println("From Interface 2");
	}
	
	static void run4() {
		System.out.println("From InterfaceA Static method");
	}
}

public class Multiple_Inheritance{

	public static void main(String[] args) {
	
		ClassA obj=new ClassA();
		
		obj.run1();
		obj.run2();
		
		
		obj.run3();
		
		obj.run4();  //Possible but it is not Recommended
		ClassA.run4();  //is Recommended
		
		System.out.println(obj.i);   //Possible but it is not Recommended
		System.out.println(ClassA.i);  //is Recommended
	}
}
