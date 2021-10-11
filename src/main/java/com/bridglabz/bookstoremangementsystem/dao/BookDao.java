package com.bridglabz.bookstoremangementsystem.dao;

import java.util.ArrayList;
import java.util.List;

import com.bridglabz.bookstoremangementsystem.entity.Book;
import com.bridglabz.bookstoremangementsystem.interfaces.IBookDao;

public class BookDao implements IBookDao {
	private List<Book> books = new ArrayList<Book>();

	@Override
	public void add(Book book) {
		
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
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		return null;
	}
}
