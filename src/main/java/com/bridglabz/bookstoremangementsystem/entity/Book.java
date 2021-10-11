package com.bridglabz.bookstoremangementsystem.entity;
//Dinesh
public class Book {
	private String bookName;
	private String bookId;
	private String bookAuthor;
	private String bookType;
	private String bookPrice;
	private String bookDesc;

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

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public String getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookDesc() {
		return bookDesc;
	}

	public void setBookDesc(String bookDesc) {
		this.bookDesc = bookDesc;
	}

}
