package com.library.managment;

import java.time.LocalDate;

public class Books{
	private String bookName;
	private String bookAuthor;
	
	public Books(String bookName, String bookAuthor) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	@Override
	public String toString() {
		return "Books [bookName=" + bookName + ", bookAuthor=" + bookAuthor + "]";
	}

	
	
}
