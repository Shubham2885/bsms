package com.bridglabz.bookstoremangementsystem.services;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.bridglabz.bookstoremangementsystem.entity.User;
import com.bridglabz.bookstoremangementsystem.exception.BookStoreMangementSystemException;

public class UserServiceImplTest {

	UserServiceImpl userService;
	
	@Before
	public void setUp() {
		userService = new UserServiceImpl();
	}
	
	@Test
	public void AddUserTest() throws BookStoreMangementSystemException {
		User user = new User("101","Manoj","8412824420","manoj123@gmail.com","Udgir");
		int response = userService.add(user);
		assertEquals(1, response);
	}
}
