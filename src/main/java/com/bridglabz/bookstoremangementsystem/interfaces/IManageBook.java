package com.bridglabz.bookstoremangementsystem.interfaces;

import java.util.List;

import com.bridglabz.bookstoremangementsystem.entity.ManageBook;

public interface IManageBook {
	void addManageBook(ManageBook manageBook);
	ManageBook deleteById(String id);
	ManageBook searchById(String id);
	ManageBook updateById(String id);
	List<ManageBook> getAllManageBooks();
}
