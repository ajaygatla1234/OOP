package com.gl.abstraction;

abstract class Bike1{
	abstract void run();
}

class Pulsar1 extends Bike1{
	void run() {
		System.out.println("Pulsar is Running");
	}
}

class KTM1 extends Bike1{
	void run() {
		System.out.println("KTM is Running");
	}
}

public class AbstractDemo_Interface {

	public static void main(String[] args) {
//		Bike1 obj = new Bike1(); //we cannot create Object for abstract class, because there will be no implementation in methods.
		//instead we have to use up-casting, so that abstract methods can get implementation from child class.
		
		Bike obj1=new Pulsar();
		obj1.run();
		
		Bike obj2=new KTM();
		obj2.run();
	}
}