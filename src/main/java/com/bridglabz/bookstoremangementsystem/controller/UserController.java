package com.bridglabz.bookstoremangementsystem.controller;

import java.util.Scanner;

import com.bridglabz.bookstoremangementsystem.entity.User;
import com.bridglabz.bookstoremangementsystem.exception.BookStoreMangementSystemException;
import com.bridglabz.bookstoremangementsystem.services.UserServiceImpl;
import com.bridglabz.bookstoremangementsystem.utility.UtilScanner;

public class UserController {

	//addUser By Manoj
	public void addUser() throws BookStoreMangementSystemException {
		User user = new User();
		UserServiceImpl userService = new UserServiceImpl();
		Scanner sc = new Scanner(System.in);
		
		user.setId(UtilScanner.getString("Enter User ID : "));
		
		user.setName(UtilScanner.getString("Enter User Name : "));
		
		user.setMobile(UtilScanner.getString("Enter User Mobile : "));
		
		user.setEmail(UtilScanner.getString("Enter User Email : "));

		user.setAddress(UtilScanner.getString("Enter User Address : "));
		
		userService.add(user);
	}
}
