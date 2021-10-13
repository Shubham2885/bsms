package com.bridglabz.bookstoremangementsystem.services;

import java.util.List;
import java.util.Scanner;

import com.bridglabz.bookstoremangementsystem.controller.ManageBookController;
import com.bridglabz.bookstoremangementsystem.dao.ManageBookDao;
import com.bridglabz.bookstoremangementsystem.dao.UserDao;
import com.bridglabz.bookstoremangementsystem.entity.ManageBook;
import com.bridglabz.bookstoremangementsystem.interfaces.IManageBook;
import com.bridglabz.bookstoremangementsystem.interfaces.IUserDao;

public class ManageBookServiceImpl implements IManageBook {
	
	private ManageBookDao  manageBookDao = null;
	public ManageBookServiceImpl() {
		manageBookDao = new ManageBookDao();
	}
	
	
	@Override
	public void addManageBook(ManageBook manageBook) {
		manageBookDao.addManageBook(manageBook);
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
}
