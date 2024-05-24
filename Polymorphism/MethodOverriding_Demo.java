package com.gl.polymorphism;

class Parent{
	public void info() {
		System.out.println("From Parent Class");
	}

	public void info2() {
		System.out.println("From Parent Class");
	}
}

class Child extends Parent{
	public void info() {
		System.out.println("From Child Class");
	}

	public void info1() {
		System.out.println("From Child Class");
	}
}

public class MethodOverriding_Demo {

	public static void main(String[] args) {

		//Up-casting allows treating a subclass object as a superclass object, enabling poly-morphism.
		//If a method is overridden in the child class, then child class method is implemented, if not
		//parent class method is implemented
		//it cannot access the Individual Child class methods, only overridden methods can be accessed
		Parent obj1=new Child();  //Up-casting
		obj1.info();
		obj1.info2();
//		obj1.info1(); //Error, because it cannot access the Child class methods

		//Down-casting is used to access subclass-specific methods but must be done with caution to avoid runtime exceptions.
		//obj2 also works same, If a method is overridden in the child class, then child class method is implemented, if not
		//parent class method is implemented
		//it can also access the Individual Child class methods which are not overridden.

		//Always perform an instance-of check before down-casting to ensure safety.

		if (obj1 instanceof Child) { // Check before downcasting
			Child obj2=(Child)obj1;  //down-casting
			obj2.info();
			obj2.info1();
			obj2.info2();
		}
	}
}
