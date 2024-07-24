package vector;

import java.util.Stack;

public class Stack_Practice {

	public static void main(String[] args) {

		// The Stack class in Java can only be instantiated using the default constructor.
		// Attempting to create a Stack with an initial size or by passing a list is not allowed:
		// Stack<String> books = new Stack<String>(10); // This will cause a compilation error
		// Stack<String> books = new Stack<String>(list); // This will also cause a compilation error

		// A Stack should always be created using the default (empty) constructor
		Stack<String> books = new Stack<String>();

		books.add("Red");
		books.add("Black");
		books.add(0,"White");

		books.remove("Red");
		books.remove(0);

		books.set(0, "Yellow");

		System.out.println(books.contains("Red"));
		System.out.println(books.contains("Yellow"));

		books.clear();

		System.out.println(books);

		// Note:
		// All the above operations (add, remove, set, contains, clear) are List operations.
		// Although these operations are available in Stack (because Stack extends Vector which implements List),
		// they are not the primary operations intended for Stack usage.
		// Stack is designed to follow the Last-In-First-Out (LIFO) principle.


		// Below are examples of typical Stack operations (following LIFO):

		Stack<String> books1 = new Stack<String>();

		//push() and add() exactly equal
		books1.push("White");
		books1.push("Red");
		books1.push("Yellow");



		//Search method returns the position of search element from top, not the index
		System.out.println(books1.search("Yellow"));  //Here the index of Yellow is 2, but its position is in first place, so gives 1

		//to get the index we can use
		System.out.println(books1.indexOf("Yellow"));


		System.out.println(books1.peek());   //Just returns the top element
		System.out.println(books1);

		System.out.println(books1.pop());   //Removes the Top element and Returns it
		System.out.println(books1);

		System.out.println(books1.empty());


		// The methods push(), pop(), peek(), search(), and empty() are specifically for Stack.
		// All other methods (add, remove, set, contains, clear) come from List and Vector.


















	}

}
