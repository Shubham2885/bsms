package com.bridglabz.bookstoremangementsystem.entity;

//Dinesh
public class ManageBook {
	private String id;
	private String userId;
	private String bookId;
	private String dateOfIssue;
	private String quantity;
	private String totalPrice;
	private String dateOfReturn;

	public ManageBook() {
		super();
	}

	public ManageBook(String id, String userId, String bookId, String dateOfIssue, String quantity, String totalPrice,
			String dateOfReturn) {
		super();
		this.id = id;
		this.userId = userId;
		this.bookId = bookId;
		this.dateOfIssue = dateOfIssue;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.dateOfReturn = dateOfReturn;
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

	public String getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(String dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getDateOfReturn() {
		return dateOfReturn;
	}

	public void setDateOfReturn(String dateOfReturn) {
		this.dateOfReturn = dateOfReturn;
	}

}
