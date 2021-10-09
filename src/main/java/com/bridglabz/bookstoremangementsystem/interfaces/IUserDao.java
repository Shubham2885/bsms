package com.bridglabz.bookstoremangementsystem.interfaces;

import com.bridglabz.bookstoremangementsystem.entity.User;

public interface IUserDao {
	void add(User user);
	void deleteById(int id);
	void searchById(int id);
	void updateById(int id);
}
