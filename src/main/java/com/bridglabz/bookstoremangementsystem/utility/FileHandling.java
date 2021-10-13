package com.bridglabz.bookstoremangementsystem.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridglabz.bookstoremangementsystem.entity.Book;
import com.bridglabz.bookstoremangementsystem.entity.ManageBook;
import com.bridglabz.bookstoremangementsystem.entity.User;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;

public class FileHandling<T> {
	
	List<T> listOfT;
	
	static final String USER_LIST_FILE_NAME = "User.json"; 
	static final String BOOK_LIST_FILE_NAME = "Books.json";
	static final String MANAGE_BOOK_FILE_LIST = "ManageBooks.json";
	
	//create file
		private File file = null;
		private File booksFile = null;
		private File mn_file = null;
		private Gson gson = null;
	
	public FileHandling(List<T> listOfT) {
		this.listOfT = listOfT;
		booksFile = new File(BOOK_LIST_FILE_NAME);
		mn_file = new File(MANAGE_BOOK_FILE_LIST);
		gson = new Gson();
	}
	
	/*public FileHandling() {
		file = new File(USER_LIST_FILE_NAME);
		booksFile = new File(BOOK_LIST_FILE_NAME);
		mn_file = new File(MANAGE_BOOK_FILE_LIST);
		gson = new Gson();
	}*/
	
	public void writeUser(List<User> users) {
		String jsonString = gson.toJson(users);
		System.out.println(jsonString);
		try {
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(jsonString);
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//reading from userlist file
	public List<User> readUser() {
		try {
			if(file.exists()) {
				BufferedReader bufferedReader = new BufferedReader(new FileReader(USER_LIST_FILE_NAME));
				User[] users = gson.fromJson(bufferedReader, User[].class);
				List<User> userList = new ArrayList<User>();
				List<User> userList1 = Arrays.asList(users);
				for(User user : userList1) {
					userList.add(user);
				}
				System.out.println(userList);
				return userList;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//writing to Books
		public void writeBook(List<Book> books) {
			String jsonString = gson.toJson(books);
			System.out.println(jsonString);
			try {
				FileWriter fileWriter = new FileWriter(booksFile);
				fileWriter.write(jsonString);
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		//reading from BookList from file
		public List<Book> readBook() {
			try {
				if(file.exists()) {
					BufferedReader bufferedReader = new BufferedReader(new FileReader(BOOK_LIST_FILE_NAME));
					Book[] books = gson.fromJson(bufferedReader, Book[].class);
					List<Book> bookList = new ArrayList<Book>();
					List<Book> bookList1 = Arrays.asList(books);
					for(Book book : bookList1) {
						bookList.add(book);
					}
					System.out.println(bookList);
					return bookList;
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			return null;
		}
		
		
		
		//write to ManageBookList
		public void writeToManageBook(List<ManageBook> mnbooks) {
			String jsonString = gson.toJson(mnbooks);
			System.out.println(jsonString);
			try {
				FileWriter fileWriter = new FileWriter(mn_file);
				fileWriter.write(jsonString);
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//reading from manageBook file
		public List<ManageBook> readFromManageBook() {
			try {
				file = new File(USER_LIST_FILE_NAME);
				if(file.exists()) {
					BufferedReader bufferedReader = new BufferedReader(new FileReader(MANAGE_BOOK_FILE_LIST));
					ManageBook[] mnBooks = gson.fromJson(bufferedReader, ManageBook[].class);
					List<ManageBook> mnBookList = new ArrayList<ManageBook>();
					List<ManageBook> mnBookList1 = Arrays.asList(mnBooks);
					for(ManageBook mnbook : mnBookList1) {
						mnBookList.add(mnbook);
					}
					System.out.println(mnBookList);
					return mnBookList;
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			return null;
		}
		
		
		
		//Generalize for write and read
		
		public void write2File(String fileUrl, List<T> list) {
			String jsonString = gson.toJson(list);
			System.out.println(jsonString);
			try {
				FileWriter fileWriter = new FileWriter(new File(fileUrl));
				fileWriter.write(jsonString);
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	
		}
		
		public List<T> readFromFile(String fileUrl) {
			try {
				file = new File(fileUrl);
				if(file.exists()) {
			        JSONParser parser = new JSONParser();
					JSONArray a = (JSONArray) parser.parse(new FileReader(fileUrl));
					
				}
			} catch (JsonParseException e) {
				e.printStackTrace();
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		
		
}
