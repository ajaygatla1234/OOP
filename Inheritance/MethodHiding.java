package com.gl.inheritance;

class Parent{
	
	public static void staticMethod() {
		System.out.println("From Parent");
	}
}

class Child extends Parent{
	public static void staticMethod() {
		System.out.println("From Child");
	}
}


public class MethodHiding {

	public static void main(String[] args) {
		
		Parent.staticMethod();
		Child.staticMethod();
		
		Parent obj = new Parent(); //calls the static methods through Class Reference(Parent obj), not the Object Reference(new Parent())
		obj.staticMethod();
		
		Parent obj1 = new Child();   
		obj1.staticMethod();      //calls the static methods through Class Reference(Parent obj1), not the Object Reference(new Child())
		//Method Hiding Falls Under Compile Time Poly-morphism
	}
	
	//Extra:
	//Method Overriding - methods are called using Object Reference

}
