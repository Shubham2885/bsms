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

import com.bridglabz.bookstoremangementsystem.entity.User;
import com.google.gson.Gson;

public class FileHandling {

	private static final String FILE_NAME = "User.json"; 
	//create file
	private File file = null;
	private Gson gson = null;
	
	public FileHandling() {
		file = new File(FILE_NAME);
		gson = new Gson();
	}
	
	//writing 
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
	
	//reading
	public List<User> readUser() {
		try {
			if(file.exists()) {
				BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_NAME));
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
}
