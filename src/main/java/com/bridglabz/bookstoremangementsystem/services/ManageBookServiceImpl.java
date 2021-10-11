package com.bridglabz.bookstoremangementsystem.services;

import java.util.List;
import java.util.Scanner;

import com.bridglabz.bookstoremangementsystem.controller.ManageBookController;
import com.bridglabz.bookstoremangementsystem.entity.ManageBook;
import com.bridglabz.bookstoremangementsystem.interfaces.IManageBook;

public class ManageBookServiceImpl implements IManageBook {

	@Override
	public void addManageBook(ManageBook manageBook) {
		
	}

	@Override
	public ManageBook deleteById(String id) {
		
		return null;		
	}

	@Override
	public ManageBook searchById(String id) {
		
		return null;
	}

	@Override
	public ManageBook updateById(String id) {
		
		return null;
	}

	@Override
	public List<ManageBook> getAllManageBooks() {
		
		return null;
	}
	
	public ManageBookController buyBook() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Book Name");
		String bookName = scanner.next();
		
		System.out.println("Enter Auther Name");
		String auther = scanner.next();
		
		System.out.println("Enter Book Edition");
		int edition = scanner.nextInt();
		
		return new ManageBookController(bookName,auther,edition);
	}
	
}
