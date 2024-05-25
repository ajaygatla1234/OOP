package com.gl.composition;

import java.util.ArrayList;
import java.util.List;

class Book {

	private String title;
	private String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	//Generally toString() gives the address, so overriding it to display the data
	@Override
	public String toString() {
		return "Title: " + title + ", Author: " + author;
	}
}


public class Library1{

	private String libraryName;
	private List<Book> books;

	public Library1(String libraryName) {
		this.libraryName=libraryName;
		this.books=new ArrayList<Book>();
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public void addBook(String title, String author) {  //user defined method for adding book
		Book book = new Book(title, author);
		this.books.add(book);
	}

	public static void main(String[] args) {

		Library1 library=new Library1("University Library");

		//snippet (composition) creates new Book objects within the Library.
		library.addBook("Jk Rowling", "Harry Potter");  //using User Defined method
		library.addBook("Jk", "Harry");
		
		System.out.println(library.libraryName);
		for(Book book:library.getBooks()) {
			System.out.println(book);
		}
		//OR 
		//System.out.println(library.books.toString());

		//Extra : We can also add new list to books
		Library1 library1=new Library1("Local Library");
		
		library1.addBook("Ramayanam", "Valmiki");
		library1.addBook("Bharatam", "Veda Vyas");

		System.out.println("\n");
		System.out.println(library1.libraryName);
		for(Book book:library1.getBooks()) {  //Iterates over the list and calls toString on each element, which is why your Book objects' toString methods are called when printing the list.
			System.out.println(book);
		}
		//OR 
		//System.out.println(library1.books.toString());  //Iterates over the list and calls toString on each element, which is why your Book objects' toString methods are called when printing the list.

		
		//Demonstration of Composition 1
		//Let use delete the Library object and try to access the book object
		System.out.println(library.books.toString());
		library=null;
		System.out.println(library.books.toString()); //Error, because deleting the Library object will also delete the Books object
		//Here Book Component Depends on Library Component, So after deleting library object, book object automatically gets deleted.
		//Book Object creation is the part of Library Object Creation, Without Library Object, Book Object cannot be created.
		//And We cannot delete the Book object
		
		
		//Extra: How "System.out.println(library.books.toString());" works ?
		//when we use the above code, first the toString() from ArrayList is called, which in-turn calls the toString() of Book class.
		//However Book class gets toString() from Object class, it will return address.
		//If we Override the toString() as per our wish, then the data present 
		//we can override the toString() as we want, to display the data
		
		//Proof that first ArrayList toString() is called:
		//The toString()in Object class will return the String without any square Brackets "[ ]".
		//But toString() in ArrayList Provides "[ ]" and calls the toString() of Book class.
		//if toString() is overridden then the data is displayed inside "[ ]".
		//or else address is printed inside "[ ]".
	}
}
