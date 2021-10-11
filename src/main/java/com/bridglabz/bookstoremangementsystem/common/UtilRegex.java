package com.bridglabz.bookstoremangementsystem.common;

public class UtilRegex {
	public static final String ID = "^[0-9]{3}$";
	public static final String NAME = "^[A-Z]{1}[A-Za-z]{1,9}$";
	public static final String MOBILE = "^[6-9]{1}[1-9]{9}$";
	public static final String EMAIL = "^[A-Za-z0-9+_.-]+@(.+)$";
	public static final String ADDRESS = "^[A-Z]{1}[A-Za-z]{1,20}$";
}
