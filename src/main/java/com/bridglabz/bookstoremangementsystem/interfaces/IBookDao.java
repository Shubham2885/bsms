package com.bridglabz.bookstoremangementsystem.interfaces;

import com.bridglabz.bookstoremangementsystem.entity.Book;

public interface IBookDao {
	void add(Book book);
	void deleteById(String id);
	void searchById(String id);
	void updateById(String id);
	void getAllBook();
}
