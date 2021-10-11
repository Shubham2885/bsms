package com.bridglabz.bookstoremangementsystem;
//Dinesh
import com.bridglabz.bookstoremangementsystem.utility.UtilScanner;

public class App {
	public static void main(String[] args) {
		App.menu();
	}

	public static void menu() {
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

	public static void bookMenu() {
		boolean flag = false;

		while (flag != true) {
			int choice = UtilScanner.getInt("Enter\n1-Case1\n2-Case2\n3-Case3\n4-Exit");
			switch (choice) {
			case 1:
				System.out.println("Case 1 Called");
				break;
			case 2:
				System.out.println("Case 2 Called");
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
