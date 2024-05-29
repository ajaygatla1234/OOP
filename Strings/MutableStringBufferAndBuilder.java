package com.gl.strings;

public class MutableStringBufferAndBuilder {

	public static void main(String[] args) {
		
		System.out.println("\n=============String Buffer=============\n");
		
		StringBuffer str= new StringBuffer("Welcome to StringBuffer");
		
		System.out.println("Original String : "+str+"\nLength of Original String : "+str.length());
		
		str.append(" Class");
		System.out.println("\nModified String : "+str+"\nLength of Modified String : "+str.length());
		
		str.insert(8, "X");
		System.out.println("\nModified String : "+str+"\nLength of Modified String : "+str.length());
		
		
		
		System.out.println("\n=============String Builder=============\n");
		
		StringBuilder str1= new StringBuilder("Welcome to StringBuffer");
		
		System.out.println("Original String : "+str1+"\nLength of Original String : "+str1.length());
		
		str1.append(" Class");
		System.out.println("\nModified String : "+str1+"\nLength of Modified String : "+str1.length());
		
		str1.insert(8, "X");
		System.out.println("\nModified String : "+str1+"\nLength of Modified String : "+str1.length());
	}

}
