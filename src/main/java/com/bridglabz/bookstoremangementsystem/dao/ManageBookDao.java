package com.bridglabz.bookstoremangementsystem.dao;

import java.util.ArrayList;
import java.util.List;

import com.bridglabz.bookstoremangementsystem.entity.ManageBook;
import com.bridglabz.bookstoremangementsystem.entity.User;
import com.bridglabz.bookstoremangementsystem.interfaces.IManageBook;

public class ManageBookDao implements IManageBook {
	private List<ManageBook> manageBook = new ArrayList<ManageBook>();
	
	@Override
	public void addManageBook(ManageBook manageBook) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ManageBook deleteById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ManageBook searchById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ManageBook updateById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ManageBook> getAllManageBooks() {
		// TODO Auto-generated method stub
		return null;
	}

}
