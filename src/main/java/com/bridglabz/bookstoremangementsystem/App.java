package com.bridglabz.bookstoremangementsystem;
import java.util.Scanner;

import com.bridglabz.bookstoremangementsystem.controller.BookController;
import com.bridglabz.bookstoremangementsystem.dao.BookDao;
import com.bridglabz.bookstoremangementsystem.entity.Book;
import com.bridglabz.bookstoremangementsystem.exception.BookStoreMangementSystemException;
import com.bridglabz.bookstoremangementsystem.services.BookServiceImpl;
//Dinesh
import com.bridglabz.bookstoremangementsystem.utility.UtilScanner;

public class App {
	public static void main(String[] args) throws BookStoreMangementSystemException {
		App.menu();
	}

	public static void menu() throws BookStoreMangementSystemException{
		boolean flag = false;

		while (flag != true) {
			int choice = UtilScanner.getInt("Enter\n1-User\n2-Book\n3-Exit");
			switch (choice) {
			case 1:
				App.userMenu();
				break;
			case 2:
					App.bookMenu();
				break;
			case 3:
				System.out.println("Exit!!");
				flag = true;
				break;
			}
		}
	}

	public static void userMenu() {
		boolean flag = false;

		while (flag != true) {
			int choice = UtilScanner.getInt("Enter\n1-Add User\n2-Update User\n3-Delete User\n4-Exit");
			switch (choice) {
			case 1:
				System.out.println("Add Method");
				break;
			case 2:
				System.out.println("Update Method");
				break;
			case 3:
				System.out.println("Delete Method");
				break;
			case 4:
				System.out.println("Exit!!");
				flag = true;
				break;
			}
		}
	}

	public static void bookMenu() throws BookStoreMangementSystemException {
		BookController bookController = new BookController();
		BookDao bookDao = new BookDao();
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		while (flag != true) {
			System.out.println("Enter\n1-Add Book\n2-Display all Books\n3-Case3\n4-Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				bookController.getBookInfo();
				System.out.println("Book Added..");
				break;
			case 2:
				System.out.println("Display all Books...");
				bookDao.getAllBook();
				break;
			case 3:
				System.out.println("Case 3 Called");
				break;
			case 4:
				System.out.println("Exit!!");
				flag = true;
				break;
			}
		}
	}
}
