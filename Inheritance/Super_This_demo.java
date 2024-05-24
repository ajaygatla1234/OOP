package com;

class Second{
	
	Second(){
		System.out.println("Get");
	}
	
	public void greet() {
		System.out.println("Good mrng");
	}
}

public class Super_This_demo extends Second{

	public Super_This_demo(){
		super();
		super.greet();
		System.out.println("Hi");
	}
	
	public Super_This_demo(int i) {
		this();
		this.food();
	}
	public void food() {
		System.out.println("Eat food");
	}
	
	public static void main(String[] args) {
		Super_This_demo obj = new Super_This_demo(8);
	}
	
	/*
	 * Constructor calling should be the first statement inside the constructor
	 * 
	 * -In Java, you cannot directly call multiple superclass constructors within a single subclass constructor. 
	 * The reason is that the call to a superclass constructor (super(...)) must be the first statement in a constructor. 
	 * Once you call one superclass constructor, you cannot call another.
	 * 
	 * No, in Java, you cannot use both this() and super() in the same constructor. same reason as above
	 * */
}


