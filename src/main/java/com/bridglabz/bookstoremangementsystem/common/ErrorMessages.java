package com.bridglabz.bookstoremangementsystem.common;

public enum ErrorMessages {

	DATA_NOT_FOUND("Data Not Found"),
	FIELD_IS_EMPTY(" field is Empty"),
	DATA_NOT_MATCH("Invalid Data");
	private String constant;
	
	private ErrorMessages(String constant) {
		this.constant = constant;
	}
	
	public String getConstant() {
		return constant;
	}
}
