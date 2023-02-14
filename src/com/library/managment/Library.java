package com.library.managment;

import java.time.LocalDate;
import java.util.ArrayList;

class Library{
	public ArrayList<Books> books;
	public String issueTo;
	public LocalDate issueDate;
	LocalDate date = LocalDate.now();

	public Library(ArrayList<Books> books) {
		super();
		this.books = books;
	}
	
	public void addBook(Books books) {
		System.out.println(books+" has been added to Libraray");
		this.books.add(books);
	}
	
	public void issueBook(Books books, String issuedTo) {
		System.out.println(books+" has been issued to"+issuedTo);
		this.issueTo = issuedTo;
		this.issueDate = date;
		this.books.remove(books);
	}
	
	public void returnBook(Books books) {
		System.out.println(books+" has been retruned");
		this.books.add(books);
	}

	@Override
	public String toString() {
		return "Library [books=" + books + "]";
	}
	
	

	
	
}
