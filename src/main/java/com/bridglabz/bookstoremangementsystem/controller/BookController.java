package com.bridglabz.bookstoremangementsystem.controller;

import com.bridglabz.bookstoremangementsystem.entity.Book;
import com.bridglabz.bookstoremangementsystem.exception.BookStoreMangementSystemException;
import com.bridglabz.bookstoremangementsystem.interfaces.IBookService;
import com.bridglabz.bookstoremangementsystem.utility.UtilScanner;

public class BookController {

	private IBookService bookService;
	
	public void setBookService(IBookService bookService) {
		this.bookService = bookService;
	}	
	
	
	public void getBookInfo() throws BookStoreMangementSystemException {
		Book book = new Book();
		
		book.setBookName(UtilScanner.getString("Book Name :"));
		book.setBookId(UtilScanner.getString("Id : "));
		book.setBookAuthor(UtilScanner.getString("Auther :"));
		book.setBookType(UtilScanner.getString("Type : "));
		book.setBookPrice(UtilScanner.getString("Prize : "));
		book.setBookDesc(UtilScanner.getString("Book Description"));
		bookService.addBook(book);
		}
	
	public static void main(String[] args) throws BookStoreMangementSystemException {
		BookController book = new BookController();
		book.getBookInfo();
	}
}
