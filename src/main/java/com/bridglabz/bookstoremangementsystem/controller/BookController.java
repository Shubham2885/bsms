package com.bridglabz.bookstoremangementsystem.controller;

import java.util.Scanner;

import com.bridglabz.bookstoremangementsystem.entity.Book;
import com.bridglabz.bookstoremangementsystem.exception.BookStoreMangementSystemException;
import com.bridglabz.bookstoremangementsystem.interfaces.IBookService;
import com.bridglabz.bookstoremangementsystem.interfaces.IUserService;
import com.bridglabz.bookstoremangementsystem.services.BookServiceImpl;
import com.bridglabz.bookstoremangementsystem.services.UserServiceImpl;
import com.bridglabz.bookstoremangementsystem.utility.UtilScanner;

public class BookController {

	private IBookService bookService;
	
	public void setBookService(IBookService bookService) {
		this.bookService = bookService;
	}	
	
	
	public void getBookInfo() throws BookStoreMangementSystemException {
		Scanner scanner = new Scanner(System.in);
		IBookService bookService = new BookServiceImpl();
		
		System.out.println("bookname");
		String id = scanner.next();

		System.out.println("id");
		String name = scanner.next();

		System.out.println("authername");
		String auther = scanner.next();

		System.out.println("type");
		String type = scanner.next();

		System.out.println("prize");
		String prize = scanner.next();

		System.out.println("desc");
		String desc = scanner.next();
		scanner.close();
		bookService.addBook(new Book(name,id,auther,type,prize,desc));
	}
	
	/*public static void main(String[] args) throws BookStoreMangementSystemException {
		BookController user = new BookController();
		user.getBookInfo();
	}*/
}
