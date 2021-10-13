package com.bridglabz.bookstoremangementsystem.dao;

import java.util.ArrayList;
import java.util.List;

import com.bridglabz.bookstoremangementsystem.entity.Book;
import com.bridglabz.bookstoremangementsystem.entity.User;
import com.bridglabz.bookstoremangementsystem.interfaces.IBookDao;
import com.bridglabz.bookstoremangementsystem.utility.FileHandling;

public class BookDao implements IBookDao {
private FileHandling<Book> fileHandling;
	
	public BookDao() {
		this.fileHandling = new FileHandling<Book>(new ArrayList<Book>());
	}
	
	@Override
	public void add(Book book) {
		List<Book> books = fileHandling.readBook();
		if(books == null) {
			books = new ArrayList<Book>();
		}
		books.add(book);
		fileHandling.write2File("Books.json",books);
	}

	@Override
	public void deleteById(String id) {
		
		
	}

	@Override
	public void searchById(String id) {
		
	}

	@Override
	public void updateById(String id) {
		
	}

	@Override
	public void getAllBook() {
		for(Book book: fileHandling.readBook()) {
			System.out.println(book);
		}
	}
}
