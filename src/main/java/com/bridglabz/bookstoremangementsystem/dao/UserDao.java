package com.bridglabz.bookstoremangementsystem.dao;

import java.util.ArrayList;
import java.util.List;

import com.bridglabz.bookstoremangementsystem.entity.User;
import com.bridglabz.bookstoremangementsystem.interfaces.IUserDao;

public class UserDao implements IUserDao {
	
	private List<User> users = new ArrayList<User>();

	@Override
	public int add(User user) {
		users.add(user);
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
		// TODO Auto-generated method stub
		return null;
	}

}
