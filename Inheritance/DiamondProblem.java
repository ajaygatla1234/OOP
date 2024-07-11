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

	//Error arises when we have the same default methods in both the interfaces, so we can resolve it by following below procedure.
	//if we have different default methods in both the interfaces, then there will be no Error.

	// Resolving the diamond problem by overriding the run1 method
	//If two interfaces have methods with the same name and implementation, we can call either method from those interfaces.
	@Override
	public void run1() {	
		InterfaceB1.super.run1();  // Explicitly call Parent1's implementation
	}

	//this can be done only if we have same default methods in both the interfaces, if we have different default methods in both the interfaces, then it is not needed as error will not arise
}

public class DiamondProblem {
	
	public static void main(String[] args) {
		ClassA1 obj = new ClassA1();
		obj.run1();
	}
}
