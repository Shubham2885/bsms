package com.bridglabz.bookstoremangementsystem.interfaces;

import com.bridglabz.bookstoremangementsystem.entity.User;
import com.bridglabz.bookstoremangementsystem.exception.BookStoreMangementSystemException;

public interface IUserService {
	void add(User user) throws BookStoreMangementSystemException;
	void deleteById();
	void searchById();
	void updateById();
}
