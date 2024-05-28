package com.gl.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MultipleExceptionsHandling {
	public static void main(String[] args) {
		try {
			// This block might throw multiple exceptions

			// Example 1: ArithmeticException
			int result = 10 / 0; // Division by zero

			// Example 2: FileNotFoundException
			FileReader file = new FileReader("nonexistentfile.txt");

			// Example 3: ArrayIndexOutOfBoundsException
			int[] array = new int[3];
			int invalidIndex = array[5]; // Accessing invalid array index

		} 
		catch (ArithmeticException e) {
			System.out.println("Caught ArithmeticException: " + e.getMessage());
		} 
		catch (FileNotFoundException e) {
			System.out.println("Caught FileNotFoundException: " + e.getMessage());
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
		} 
		
		//When handling exceptions, it's important to predict and catch as many specific exceptions as possible. 
		//If there are any remaining exceptions that weren't specifically caught, you can use a general catch block at the end to handle them. 
		//However, if you place the general catch block at the beginning or anywhere else, it will always be executed for any type of exception, 
		//and the subsequent catch blocks won't be reached. 
		//Therefore, it's better to use multiple specific catch blocks for different types of exceptions, and keep the general catch block at the end.
		
		catch (Exception e) {
			System.out.println("Caught Exception: " + e.getMessage());
		} 
		finally {
			System.out.println("Finally block executed.");
		}
		
		//If int result = 10 / 0; produces Exception, then other line of codes after this line, will not be executed.
		//so put valid number instead of 0, the other line(FileReader) gets executed, then FileNotFoundException catch block is executed
		//Similarly do for next Exception.
	}
}
