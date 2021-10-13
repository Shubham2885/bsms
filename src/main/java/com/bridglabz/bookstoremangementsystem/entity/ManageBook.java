package com.bridglabz.bookstoremangementsystem.entity;

//Dinesh
import java.util.Date;

public class ManageBook {
	private String id;
	private String userId;
	private String bookId;
	private Date dateOfIssue;
	private int quantity;
	private int totalPrice;
	private Date dateOfReturn;

	public ManageBook() {
		super();
	}

	public ManageBook(String id, String userId, String bookId, java.util.Date issueDate, int quantity, int totalPrize,
			java.util.Date returnDate) {
		super();
		this.id = id;
		this.userId = userId;
		this.bookId = bookId;
		this.dateOfIssue = issueDate;
		this.quantity = quantity;
		this.totalPrice = totalPrize;
		this.dateOfReturn = returnDate;
	}

	@Override
	public String toString() {
		return "ManageBook [id=" + id + ", userId=" + userId + ", bookId=" + bookId + ", dateOfIssue=" + dateOfIssue
				+ ", quantity=" + quantity + ", totalPrice=" + totalPrice + ", dateOfReturn=" + dateOfReturn + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public Date getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Date getDateOfReturn() {
		return dateOfReturn;
	}

	public void setDateOfReturn(Date dateOfReturn) {
		this.dateOfReturn = dateOfReturn;
	}

}
