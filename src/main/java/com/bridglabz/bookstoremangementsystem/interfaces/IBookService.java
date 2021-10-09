package com.bridglabz.bookstoremangementsystem.interfaces;

import com.bridglabz.bookstoremangementsystem.entity.Book;

public interface IBookService {
	
	public void addBook(Book book);
	
	public void deleteBookbyId(Book book,String id);
	
	public void searchBookbyId(String id);
	
	public void updateBookbyId();
}
