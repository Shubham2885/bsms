package com.bridglabz.bookstoremangementsystem.dao;

import java.util.ArrayList;
import java.util.List;

import com.bridglabz.bookstoremangementsystem.entity.User;
import com.bridglabz.bookstoremangementsystem.interfaces.IUserDao;
import com.bridglabz.bookstoremangementsystem.utility.FileHandling;

public class UserDao implements IUserDao {
	
	private FileHandling<User> fileHandling;
	
	public UserDao() {
		this.fileHandling = new FileHandling<User>(new ArrayList<User>());
	}

	@Override
	public int add(User user) {
		List<User> users = fileHandling.readUser();
		if(users == null) {
			users = new ArrayList<User>();
		}
		users.add(user);
		fileHandling.writeUser(users);
		fileHandling.write2File("User.json",users);
		return users.size();
	}

	@Override
	public void deleteById(int id) {
		
	}

	@Override
	public void searchById(int id) {
		
	}

	@Override
	public void updateById(int id) {
		
	}

	@Override
	public List<User> getAllUser() {
		return fileHandling.readUser();
	}

}
