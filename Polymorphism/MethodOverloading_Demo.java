package com.gl.polymorphism;

class Shape {
	
	//circle
	public double calculateArea(double i) {
		return 3.14*i*i;
	}
	
	//square
	public double calculateArea(int i) {
		return i*i;
	}
	
	//rectangle
	public double calculateArea(double a, double b) {
		return a*b;
	}
}

public class MethodOverloading_Demo {

	public static void main(String[] args) {
		Shape obj = new Shape();
		
		System.out.println("Area of Circle : "+obj.calculateArea(23.2));
		System.out.println("Area of Square : "+obj.calculateArea(6));
		System.out.println("Area of Rectangle : "+obj.calculateArea(34.4, 24.5));
	}
}
