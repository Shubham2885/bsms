package com.bridglabz.bookstoremangementsystem.controller;

import java.util.Scanner;

import com.bridglabz.bookstoremangementsystem.entity.User;
import com.bridglabz.bookstoremangementsystem.exception.BookStoreMangementSystemException;
import com.bridglabz.bookstoremangementsystem.interfaces.IUserService;
import com.bridglabz.bookstoremangementsystem.services.UserServiceImpl;
import com.bridglabz.bookstoremangementsystem.utility.UtilScanner;

public class UserController {

	//addUser By Manoj
	public void addUser() throws BookStoreMangementSystemException {
		
		User user = new User();
		IUserService userService = new UserServiceImpl();
		Scanner sc = new Scanner(System.in);
		
		user.setId(UtilScanner.getString("User ID : "));
		
		user.setName(UtilScanner.getString("User Name : "));
		
		user.setMobile(UtilScanner.getString("User Mobile Number: "));
		
		user.setEmail(UtilScanner.getString("User Email : "));

		user.setAddress(UtilScanner.getString("User Address : "));
		
		int resp = userService.add(user);
		System.out.println("size = " + resp);
	}
	
	public static void main(String[] args) throws BookStoreMangementSystemException {
		UserController user = new UserController();
		user.addUser();
	}
	
}
