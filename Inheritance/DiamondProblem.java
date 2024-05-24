package com.gl.inheritance;

interface InterfaceA1{
	
	default void run1() {
		System.out.println("From InterfaceA1");
	}
}

interface InterfaceB1{
	
	default void run1() {
		System.out.println("From InterfaceB1");
	}
}

class ClassA1 implements InterfaceA1,InterfaceB1{

	// Resolving the diamond problem by overriding the run1 method
	//If two interfaces have methods with the same name and implementation, we can call either method from those interfaces.
	@Override
	public void run1() {	
		InterfaceB1.super.run1();  // Explicitly call Parent1's implementation
	}
}

public class DiamondProblem {
	
	public static void main(String[] args) {
		ClassA1 obj = new ClassA1();
		obj.run1();
	}
}
