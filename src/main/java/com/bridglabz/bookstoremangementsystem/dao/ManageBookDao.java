package com.bridglabz.bookstoremangementsystem.dao;

import java.util.ArrayList;
import java.util.List;

import com.bridglabz.bookstoremangementsystem.entity.ManageBook;
import com.bridglabz.bookstoremangementsystem.entity.User;
import com.bridglabz.bookstoremangementsystem.interfaces.IManageBook;
import com.bridglabz.bookstoremangementsystem.utility.FileHandling;

public class ManageBookDao implements IManageBook {
	
private FileHandling<ManageBook> fileHandling;
	
	public ManageBookDao() {
		this.fileHandling = new FileHandling<ManageBook>(new ArrayList<ManageBook>());
	}

	@Override
	public void addManageBook(ManageBook manageBook) {
		List<ManageBook> manageBookList = fileHandling.readFromManageBook();
		if(manageBookList == null) {
			manageBookList = new ArrayList<ManageBook>();
		}
		manageBookList.add(manageBook);
		fileHandling.write2File("ManageBooks.json",manageBookList);
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
		return null;
	}

}
