package com.bridglabz.bookstoremangementsystem.services;

import com.bridglabz.bookstoremangementsystem.common.ErrorMessages;
import com.bridglabz.bookstoremangementsystem.common.UtilRegex;
import com.bridglabz.bookstoremangementsystem.dao.UserDao;
import com.bridglabz.bookstoremangementsystem.entity.User;
import com.bridglabz.bookstoremangementsystem.exception.BookStoreMangementSystemException;
import com.bridglabz.bookstoremangementsystem.interfaces.IUserDao;
import com.bridglabz.bookstoremangementsystem.interfaces.IUserService;
import com.bridglabz.bookstoremangementsystem.utility.UtilValidation;

public class UserServiceImpl implements IUserService {

	IUserDao userDao = new UserDao();
	
	@Override
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	// addUser By Manoj
	@Override
	public int add(User user) throws BookStoreMangementSystemException {

		if (user.getId().trim().isEmpty())
			throw new BookStoreMangementSystemException("ID" + ErrorMessages.FIELD_IS_EMPTY.getConstant());
		else if (!UtilValidation.isValid(UtilRegex.ID, user.getId())) 
			throw new BookStoreMangementSystemException(ErrorMessages.INVALID_DATA.getConstant() + "ID");

		if (user.getName().trim().isEmpty())
			throw new BookStoreMangementSystemException("Name" + ErrorMessages.FIELD_IS_EMPTY.getConstant());
		else if (!UtilValidation.isValid(UtilRegex.NAME, user.getName())) 
			throw new BookStoreMangementSystemException(ErrorMessages.INVALID_DATA.getConstant() + "Name");

		if (user.getMobile().trim().isEmpty())
			throw new BookStoreMangementSystemException("Email" + ErrorMessages.FIELD_IS_EMPTY.getConstant());
		else if (!UtilValidation.isValid(UtilRegex.MOBILE, user.getMobile())) 
			throw new BookStoreMangementSystemException(ErrorMessages.INVALID_DATA.getConstant() + "Mobile Number");

		if (user.getEmail().trim().isEmpty())
			throw new BookStoreMangementSystemException("Email" + ErrorMessages.FIELD_IS_EMPTY.getConstant());
		else if (!UtilValidation.isValid(UtilRegex.EMAIL, user.getEmail())) 
			throw new BookStoreMangementSystemException(ErrorMessages.INVALID_DATA.getConstant() + "Email");

		if (user.getAddress().trim().isEmpty())
			throw new BookStoreMangementSystemException("Address" + ErrorMessages.FIELD_IS_EMPTY.getConstant());
		else if (!UtilValidation.isValid(UtilRegex.ADDRESS, user.getAddress())) 
			throw new BookStoreMangementSystemException(ErrorMessages.INVALID_DATA.getConstant() + "Address");

		int res =  userDao.add(user);
		return res;
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
