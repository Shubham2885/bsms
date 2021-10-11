package com.bridglabz.bookstoremangementsystem.services;

import com.bridglabz.bookstoremangementsystem.common.UtilRegex;
import com.bridglabz.bookstoremangementsystem.dao.UserDao;
import com.bridglabz.bookstoremangementsystem.entity.User;
import com.bridglabz.bookstoremangementsystem.exception.NullDetails;
import com.bridglabz.bookstoremangementsystem.interfaces.IUserService;
import com.bridglabz.bookstoremangementsystem.utility.UtilValidation;

public class UserServiceImpl implements IUserService{

	UserDao userDao = new UserDao();
	
	//addUser By Manoj
	@Override
	public void add(User user) throws NullDetails{

		if(!UtilValidation.isValid(UtilRegex.ID, user.getId())) {
			throw new NullDetails("Please enter a valid ID");
		}
		
		if(!UtilValidation.isValid(UtilRegex.NAME, user.getName())) {
			throw new NullDetails("Please enter a valid Name");
		}
		
		if(!UtilValidation.isValid(UtilRegex.EMAIL, user.getEmail())) {
			throw new NullDetails("Please enter a valid Email");
		}
		
		if(!UtilValidation.isValid(UtilRegex.MOBILE, user.getMobile())) {
			throw new NullDetails("Please enter a valid Mobile Number");
		}
		
		if(!UtilValidation.isValid(UtilRegex.ADDRESS, user.getAddress())) {
			throw new NullDetails("Please enter a valid Address");
		}
		
		userDao.add(user);
	}

	@Override
	public void deleteById() {
		
	}

	@Override
	public void searchById() {
		
	}

	@Override
	public void updateById() {
		
	}

}
