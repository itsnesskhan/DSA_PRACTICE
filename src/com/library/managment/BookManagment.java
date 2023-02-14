package com.library.managment;

import java.util.ArrayList;

public class BookManagment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books b1 = new Books("Rich Dad Poor Dad","Robert Kiosacki");
		Books b2 = new Books("Art of Living","Robert Pattinsion");
		Books b3 = new Books("Think and Grow Rich","Emma Watson");
//		System.out.println(b1.getBookAuthor());
//		System.out.println(b1.getBookName());
//		System.out.println(b1);
//		System.out.println(b2);
//		System.out.println(b3);
		ArrayList<Books> libArrayList = new ArrayList<>();	
		Library l1 = new Library(libArrayList);
		System.out.println(l1);
		l1.addBook(b3);
		l1.addBook(b2);
		l1.addBook(b1);
		l1.issueBook(b3, "Nasser Khaan");
		
		System.out.println(l1);
		l1.returnBook(b3);
		System.out.println(l1);
		
		
	}

}
