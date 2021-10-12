package com.bridglabz.bookstoremangementsystem.interfaces;

import com.bridglabz.bookstoremangementsystem.entity.User;
import com.bridglabz.bookstoremangementsystem.exception.BookStoreMangementSystemException;

public interface IUserService {
	int add(User user) throws BookStoreMangementSystemException;
	void deleteById();
	void searchById();
	void updateById();
	void setUserDao(IUserDao userDao);
}
