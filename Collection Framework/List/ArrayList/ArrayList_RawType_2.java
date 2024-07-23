package com.gl.arraylist;

import java.util.ArrayList;
import java.util.Date;

public class ArrayList_RawType_2 {
	
	public static void main(String[] args) {
		
		//In your case, ArrayList obj = new ArrayList(); creates an ArrayList without specifying a type (known as a raw type). 
		//This means it can store any type of object, but it’s generally better to use generics (like ArrayList<String> or ArrayList<Integer>) to ensure type safety1
		//However, this is generally discouraged because it bypasses the type-checking provided by generics and can lead to runtime errors.
		//To avoid these issues, it is recommended to use generics, specifying the type of elements the ArrayList will store. 
		ArrayList obj = new ArrayList();

		obj.add(10);            // Adding an integer
		obj.add("Hello");       // Adding a string
		obj.add(new Date());    // Adding a Date object

		
		int i=(int) obj.get(0);   // Needs casting to int
		String str = (String) obj.get(1);  // Needs casting to String
		Date d=(Date) obj.get(2);  //Needs casting to date
		
		System.out.println(i);
		System.out.println(str);
		System.out.println(d);
		
		
		//Using generics ensures type safety at compile-time and makes your code more robust and easier to read and maintain.
		ArrayList<String> names=new ArrayList<String>();
		names.add("Navin");
		names.add("Prashanth");
//		names.add(10);   we cannot add other type objects
		
		String str1=names.get(0);  //no type conversion required, we can directly access them
		System.out.println(str1);
	}
}