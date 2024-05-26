package com;

class ClassA { 
	ClassA(String x) {
		System.out.println("Loads "+x+"\n");
	}
}

class ClassB { 
	ClassA obj1 = new ClassA("Non static Property"); 
	
	static ClassA obj2 = new ClassA("Static Property"); 
	
	ClassB(String i) { 
		System.out.print("From ClassB Constructor, ");
		obj1=new ClassA(i); 
	}
}

public class OrderOfExecution{
	
	public static void main(String[] args) {
		ClassB obj2 = new ClassB("ClassB Object");
	}
	
}