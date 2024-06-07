package com.gl.java8;

// Functional interface with a single abstract method
interface Messageable1 {
	void getMessage();
}

// Another functional interface with a single abstract method
interface Messageable2 {
	void getMessage(String str);
}

// Message class with constructors and methods
class Message {

	// Instance method to implement Messageable1 interface method
	public void ImplementedgetMessage1() {
		System.out.println("passing ImplementedgetMessage1 Implementation to abstract getMessage() in Messageable1");
	}

	// Instance method to implement Messageable2 interface method
	public void ImplementedgetMessage2(String str) {
		System.out.println("passing ImplementedgetMessage2 Implementation to abstract getMessage(String str) in Messageable2 \ndisplay message = " + str);
	}

	// Static method with no arguments
	public static void ImplementedgetMessage3() {
		System.out.println("From static method (ImplementedgetMessage3)");
	}

	// Static method with a string argument
	public static void ImplementedgetMessage4(String str) {
		System.out.println("From static method (ImplementedgetMessage4) \ndisplay message = " + str);
	}
}

class ConstructorReference{

	// Default constructor
	public ConstructorReference() {
		System.out.println("Default Constructor");
	}

	// Parameterized constructor
	public ConstructorReference(String msg) {
		System.out.println(msg);
	}
}

public class MethodReference_2 {
	public static void main(String[] args) {
		// Using method reference to an instance method of a particular object
		System.out.println("Using method reference to an instance method of a particular object: \n--------------------------------------------------------------------");
		Message obj1 = new Message();
		Messageable1 msg1 = obj1::ImplementedgetMessage1;
		msg1.getMessage();

		Message obj2 = new Message();
		Messageable2 msg2 = obj2::ImplementedgetMessage2;
		msg2.getMessage("Hello");

		// Using method reference to an instance method of an anonymous object
		System.out.println("\n(OR) \n\nUsing method reference to an instance method of an anonymous object:\n--------------------------------------------------------------------");
		Messageable1 msg3 = new Message()::ImplementedgetMessage1;
		msg3.getMessage();

		Messageable2 msg4 = new Message()::ImplementedgetMessage2;
		msg4.getMessage("Hi");


		// Using method reference to a static method
		System.out.println("\n**************************************************************************************");
		System.out.println("Using method reference to a static method:\n--------------------------------------------");
		Messageable1 msg5 = Message::ImplementedgetMessage3;
		msg5.getMessage();

		Messageable2 msg6 = Message::ImplementedgetMessage4;
		msg6.getMessage("How r u");


		// Creating instances using constructor references
		System.out.println("\n**************************************************************************************");
		System.out.println("Creating instances using constructor references:\n------------------------------------------------");
		Messageable1 c1 = ConstructorReference::new; // Equivalent to: () -> new Message()
		c1.getMessage();

		Messageable2 c2 = ConstructorReference::new; // Equivalent to: (str) -> new Message(str)
		c2.getMessage("Hi");


		// Creating a new thread using a method reference to an instance method of a new Message object
		System.out.println("\n**************************************************************************************");
		System.out.println("Creating a new thread using a method reference to an instance method of a new Message object: \n--------------------------------------------------------------------------------------------");
		Thread t1 = new Thread(new Message()::ImplementedgetMessage1);
		t1.start(); // Starting the thread, which will invoke the ImplementedgetMessage1 method of the new Message object

	}
}
