package com.gl.exceptions;

public class ExceptionSample {
	
	public void calculate(int num1, int num2) {
		int result;
		System.out.println("Calculation started");
		result=num1/num2;
		System.out.println("The result is :"+result);
		System.out.println("Calculation finished");
		System.out.println("--------------------");
	}
	
	public void callCalculate(int a, int b) {
		
		try {
			calculate(a, b);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		ExceptionSample obj=new ExceptionSample();
		
		System.out.println("Exception Handling : Type-1\n");
		//Exception Handling : Type-1
		try {
			
			obj.calculate(10, 2);
			obj.calculate(20, 2);
			obj.calculate(30, 0);
			obj.calculate(40, 2);
			obj.calculate(50, 2);
			
		} catch (ArithmeticException e) {
			System.err.println("\nError Message : "+e.getMessage()+"\n"); //just gives error message
			e.printStackTrace();  //provides complete meaningful information along with error line number
			                      //bottom line of error is root cause, so always check from bottom
		}
		finally {
			System.out.println("\nType-1 : Handles the error,but prevents the execution of other method calls");
		}
		
		System.out.println("\n=========================================\n");
		
		//Exception Handling : Type-2
		System.out.println("Exception Handling : Type-2\n");
		obj.callCalculate(10, 2);
		obj.callCalculate(20, 2);
		obj.callCalculate(30, 0); System.out.println("\nType-2 : Handles the error, allowing the execution of other method calls\n");
		obj.callCalculate(40, 2);
		obj.callCalculate(50, 2);

	}

}
