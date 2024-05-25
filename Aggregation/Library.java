package com.gl.aggregation;

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


public class Library{

	private String libraryName;
	private List<Book> books;

	public Library(String libraryName) {
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

	public void addBook(Book book) {  //user defined method for adding book
		this.books.add(book);
	}

	public static void main(String[] args) {

		Library library=new Library("University Library");

		Book book1=new Book("JK Rowling", "Harry Potter");
		Book book2=new Book("JK", "Harry");

		////snippet (aggregation) adds existing Book objects to the library.
		library.books.add(book1); //using inbuilt method from ArrayList
		// OR
		library.addBook(book2);  //using User Defined method

		System.out.println(library.libraryName);
		for(Book book:library.getBooks()) {
			System.out.println(book);
		}

		//Extra : We can also add new list to books
		Book book3=new Book("Ramayanam", "Valmiki");
		Book book4=new Book("Bharatam", "Veda Vyas");

		Library library1=new Library("Local Library");
		library1.books.add(book3);
		//OR
		library1.addBook(book4);

		System.out.println("\n");
		System.out.println(library1.libraryName);
		for(Book book:library1.getBooks()) {
			System.out.println(book);
		}

		//Demonstration of Aggregation 1
		//Let use delete the Library object and try to access the book object
		library1=null;

		System.out.println("\n"+book3.getTitle()); //its working
		System.out.println(book3.getAuthor()); //its working
		System.out.println("\n"+book4.getTitle()); //its working
		System.out.println(book4.getAuthor()); //its working

		//Demonstration of Aggregation 2
		//Let use delete the Book object and try to access the Library object
		library.books=null;
		System.out.println(library.libraryName); //its working
		for(Book book:library.getBooks()) {  //NullPointerException, because we deleted the books object
			System.out.println(book);
		}
	}
}
