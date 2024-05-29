package com.gl.strings;

public class ImmutableString {
	
	public static void main(String[] args) {
		
		String str1="Banglore";
		String str2="Banglore";
		System.out.println("Using Literals:-");
		System.out.println("str1.equals(str2): "+str1.equals(str2)); //equals() : compares String literals(value present inside the reference variable of any type) 
		System.out.println("str1==str2: "+(str1==str2)); //"==" when using primitive variables Compares literals(values), but when using non-primitive variables references(address) are compared.
		
		str1="banglore";
		System.out.println("\nAfter changing str1=Manglore:-");
		System.out.println("str1.equals(str2): "+str1.equals(str2));
		System.out.println("str1==str2: "+(str1==str2));
		
		System.out.println("\nUsing Objects:-");
		String stra=new String("Banglore");
		String strb=new String("Banglore");
		System.out.println("stra.equals(strb): "+stra.equals(strb));
		System.out.println("stra==strb: "+(stra==strb));
		
		System.out.println("\nUsing Objects:-");
		String strc=new String("Banglore");
		String strd=new String("banglore");
		System.out.println("strc.equals(strd): "+strc.equals(strd));
		System.out.println("strc==strd: "+(stra==strb));
		
		System.out.println("\nUsing Objects:-");
		String stre=new String("Banglore");
		System.out.println("stre :"+stre);
		stre="banglore";
		System.out.println("New String stre :"+stre);
		
		System.out.println("\nUsing Object and Literal:-");
		String strf=new String("Banglore");
		String strg="Banglore";
		System.out.println("strf.equals(strg): "+strf.equals(strg));
		System.out.println("strf==strg: "+(strf==strg));
		
		//We cannot modify the String Literal.
		//Try doing "strf." and "strg." will show methods that are capable of reading the data, but not changing.
		//strf.  //even object reference can't change it
		//strg.  //also the String reference can't change it
		
		
		//	We have the concat() method to add another string literal, 
		//but we need to create a new String reference variable and assign the added existing literals to it.
		System.out.println("\nUsing Literal:-");
		String strh="Banglore";
		String stri="City";
		String strj=strh.concat(stri);
		System.out.println(strh);
		System.out.println(stri);
		System.out.println(strj);
		
		String strk=strh.concat(stri);
		System.out.println("\nUsing Literal:-");
		System.out.println("strj.equals(strk): "+strj.equals(strk));
		System.out.println("strj==strk: "+(strj==strk));
		
		System.out.println("\nUsing Literal:-");
		String strl="BangloreCity";
		System.out.println("strl.equals(strk): "+strl.equals(strk));
		System.out.println("strl==strk: "+(strl==strk));
		
	}
}

/*
 difference between System.out.println("str1==str2: "+(str1==str2)); and System.out.println("str1==str2: "+str1==str2);

 1. System.out.println("str1==str2: "+(str1==str2));:

	Here, "str1==str2: " is concatenated with the result of the expression (str1==str2). 
	The expression (str1==str2) evaluates to a boolean value (true or false) based on whether str1 and str2 refer to the same object in memory.
	(o/p = str1==str2: true)

 2. System.out.println("str1==str2: "+str1==str2);:

	In this case, "str1==str2: " is concatenated with the string variable str1, and then the equality comparison == is performed between this concatenated string and str2. 
	This is due to the operator precedence in Java, where + (string concatenation) has higher precedence than == (equality comparison). 
	Therefore, the expression System.out.println("str1==str2: "+str1) is evaluated first, resulting in a concatenated string, and then this string is compared with str2. 
	The result of this comparison (true or false) is then printed using System.out.println.
	(o/p = false)


 */
