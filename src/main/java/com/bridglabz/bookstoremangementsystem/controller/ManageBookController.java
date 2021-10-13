package com.bridglabz.bookstoremangementsystem.controller;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import com.bridglabz.bookstoremangementsystem.entity.ManageBook;
import com.bridglabz.bookstoremangementsystem.exception.BookStoreMangementSystemException;
import com.bridglabz.bookstoremangementsystem.services.ManageBookServiceImpl;

public class ManageBookController {
	
	public void buyBook() throws ParseException {
		ManageBookServiceImpl mnService = new ManageBookServiceImpl();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter ID");
		String id = scanner.next();
		
		System.out.println("Enter User ID :");
		String userID = scanner.next();
		
		System.out.println("Enter Book ID");
		String bookId = scanner.next();
		
		System.out.println("Enter Date of Issue: 01/12/2013:");
		String sDate = scanner.next();
		
		Date issueDate = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
		
		System.out.println("Enter Return Date: format  12/04/2011 ");
		String rDate = scanner.next();
		
		Date returnDate = new SimpleDateFormat("dd/MM/yyyy").parse(rDate);
		
		System.out.println("Enter Total Quantity");
		int quantity = scanner.nextInt();
		
		System.out.println("Enter Prize of the book");
		int bookprize = scanner.nextInt();
		
		int totalPrize = bookprize * quantity;
		
		scanner.close();
		
		mnService.addManageBook(new ManageBook(id,userID,bookId,issueDate,quantity,totalPrize,returnDate));
	}
	
	public static void main(String[] args) throws BookStoreMangementSystemException, ParseException {
		ManageBookController mnBooks = new ManageBookController();
		mnBooks.buyBook();
		}

}