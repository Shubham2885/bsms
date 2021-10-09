package com.bridglabz.bookstoremangementsystem.entity;

public class Book {
	String bookName;
	String bookId;
	String bookAuthor;
	String bookType;
	String bookPrice;
	String bookDesc;

	public Book() {
		super();
	}

	public Book(String bookName, String bookId, String bookAuthor, String bookType, String bookPrice, String bookDesc) {
		super();
		this.bookName = bookName;
		this.bookId = bookId;
		this.bookAuthor = bookAuthor;
		this.bookType = bookType;
		this.bookPrice = bookPrice;
		this.bookDesc = bookDesc;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookId=" + bookId + ", bookAuthor=" + bookAuthor + ", bookType="
				+ bookType + ", bookPrice=" + bookPrice + ", bookDesc=" + bookDesc + "]";
	}

	protected String getBookName() {
		return bookName;
	}

	protected void setBookName(String bookName) {
		this.bookName = bookName;
	}

	protected String getBookId() {
		return bookId;
	}

	protected void setBookId(String bookId) {
		this.bookId = bookId;
	}

	protected String getBookAuthor() {
		return bookAuthor;
	}

	protected void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	protected String getBookType() {
		return bookType;
	}

	protected void setBookType(String bookType) {
		this.bookType = bookType;
	}

	protected String getBookPrice() {
		return bookPrice;
	}

	protected void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}

	protected String getBookDesc() {
		return bookDesc;
	}

	protected void setBookDesc(String bookDesc) {
		this.bookDesc = bookDesc;
	}

}
