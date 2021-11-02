package com.bridglabz.bookstoremangementsystem.common;

import com.bridglabz.bookstoremangementsystem.services.BookServiceImpl;
import com.bridglabz.bookstoremangementsystem.services.ManageBookServiceImpl;
import com.bridglabz.bookstoremangementsystem.services.UserServiceImpl;

public class CreateBean {

	public static Object getBean(BeanEnum beanEnum) {
		switch (beanEnum) {
		case BOOKSERVICE:
			return new BookServiceImpl();
		case USERSERVICE:
			return new UserServiceImpl();
		case MANAGESERVICE:
			return new ManageBookServiceImpl();
		default:
			return null;
		}
	}
}
