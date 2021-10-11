package com.bridglabz.bookstoremangementsystem.interfaces;

import com.bridglabz.bookstoremangementsystem.entity.Book;
import com.bridglabz.bookstoremangementsystem.exception.BookStoreMangementSystemException;

public interface IBookService {
	
	public void addBook(Book book) throws BookStoreMangementSystemException;
	
	public void deleteBookbyId(Book book,String id);
	
	public void searchBookbyId(String id);
	
	public void updateBookbyId();
}
