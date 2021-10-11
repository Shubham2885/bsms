package com.bridglabz.bookstoremangementsystem.interfaces;

import com.bridglabz.bookstoremangementsystem.entity.User;
import com.bridglabz.bookstoremangementsystem.exception.NullDetails;

public interface IUserService {
	void add(User user) throws NullDetails;
	void deleteById();
	void searchById();
	void updateById();
}
