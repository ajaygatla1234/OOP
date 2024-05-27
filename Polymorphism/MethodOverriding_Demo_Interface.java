package com.gl.polymorphism;

interface Father { 
	public void work() ;
} 

class Son implements Father { 
	public void work() 
	{ 
		System.out.println("Enjoying son"); 
	} 
} 

class MethodOverriding_Demo_Interface { 
	public static void main(String[] args) 
	{ 

		//Using classes, when we perform down-casting, No compiler error is shown, only after execution it will throw ClassCastException.
		//But when using interface,and perform down-casting, it will directly show compiler error, because we cannot create instantiate interfaces.
		//Son obj1=(Son) new Father();
		Father obj=new Son();
		Son father = (Son) obj; //down-casting is done for using all the methods present in both the classes

		father.work();
	} 
}