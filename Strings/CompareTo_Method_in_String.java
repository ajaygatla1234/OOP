package com.gl.strings;

public class CompareTo_Method_in_String {

	public static void main(String[] args) {

		String a = "Ajay";
		String b = "AJay";
		String c = "";

		// Compares two strings character by character using Unicode (ASCII) values
		// and gives the difference between them.
		// In the above example, the first two characters are checked which are 'A' & 'A', which are equal.
		// Then it goes to the second character and compares.
		// Since 'j' (106) & 'J' (74), the difference between them is 106 - 74 = 32, so the output is 32.
		System.out.println(a.compareTo(b));

		if (a.compareTo(b) > 0) {  // Implies 'a' comes after 'b' in lexicographical order (alphabetical Order)
			c = a;
		} else if (a.compareTo(b) < 0) {  // Implies 'a' comes before 'b' in lexicographical order (alphabetical Order)
			c = b;
		} else {  // This condition implies both words are the same, so 'c' takes the value of 'a'
			c = a;
		}

		System.out.println(c);  // Prints the string 'c' after comparison

		// In the above program, we gave a condition to print the string which has lower alphabets (>0) as small letters ASCII values start from 97 and capital letters start from 65, so the difference will be positive. If negative, it means a capital alphabet.
		// We want capital letters string to print first, so we can modify the conditions accordingly.
		// If we want capital letters to print first, we reverse the conditions.

		String d = "";
		if (a.compareTo(b) < 0) {  // Implies 'a' comes before 'b' in lexicographical order (alphabetical Order)
			d = a;
		} else if (a.compareTo(b) > 0) {  // Implies 'a' comes after 'b' in lexicographical order (alphabetical Order)
			d = b;
		} else {  // This condition implies both words are the same, so 'd' takes the value of 'a'
			d = a;
		}

		System.out.println(d);  // Prints the string 'd' after comparison with reversed conditions

		// Extra: Difference between Every same alphabets in lowercase and uppercase:
		// If lowercase letter - uppercase letter = 32
		// If uppercase letter - lowercase letter = -32

	}

}
