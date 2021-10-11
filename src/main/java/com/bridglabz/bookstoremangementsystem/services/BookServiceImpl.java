package com.bridglabz.bookstoremangementsystem.services;

import com.bridglabz.bookstoremangementsystem.common.ErrorMessages;
import com.bridglabz.bookstoremangementsystem.common.UtilRegex;
import com.bridglabz.bookstoremangementsystem.entity.Book;
import com.bridglabz.bookstoremangementsystem.exception.BookStoreMangementSystemException;
import com.bridglabz.bookstoremangementsystem.interfaces.IBookDao;
import com.bridglabz.bookstoremangementsystem.interfaces.IBookService;
import com.bridglabz.bookstoremangementsystem.utility.UtilValidation;

public class BookServiceImpl implements IBookService {
		
	private IBookDao bookdb;

	public void setBookDB(IBookDao bookService) {
		this.bookdb = bookService;
	}
	@Override
	public void addBook(Book book) throws BookStoreMangementSystemException {
		if (book.getBookName().isEmpty() && book.getBookId().isEmpty() && book.getBookAuthor().isEmpty() && book.getBookDesc().isEmpty() && book.getBookPrice().isEmpty() && book.getBookType().isEmpty()) {
			throw new BookStoreMangementSystemException(ErrorMessages.FIELD_IS_EMPTY.getConstant());
			
		}else {
			if (!UtilValidation.isValid(book.getBookName(), UtilRegex.NAME)) {
				throw new BookStoreMangementSystemException("Book Name" + ErrorMessages.DATA_NOT_MATCH.getConstant());
			}
			
			if (!UtilValidation.isValid(book.getBookAuthor(), UtilRegex.NAME)) {
				throw new BookStoreMangementSystemException("Book Author"+ErrorMessages.DATA_NOT_MATCH.getConstant());
			}
			
			if (!UtilValidation.isValid(book.getBookType(), UtilRegex.NAME)) {
				throw new BookStoreMangementSystemException("Book Type" + ErrorMessages.DATA_NOT_MATCH.getConstant());
			}
			
			if (!UtilValidation.isValid(book.getBookPrice(), UtilRegex.PRICE)) {
				throw new BookStoreMangementSystemException("Book Price"+ ErrorMessages.DATA_NOT_MATCH.getConstant());
			}
			
			if (!UtilValidation.isValid(book.getBookId(), UtilRegex.BOOKID)) {
				throw new BookStoreMangementSystemException("Book Id"+ ErrorMessages.DATA_NOT_MATCH.getConstant());
			}
			
			
			
			if(UtilValidation.isValid(book.getBookId(), UtilRegex.BOOKID) && UtilValidation.isValid(book.getBookName(), UtilRegex.NAME)
					&& UtilValidation.isValid(book.getBookAuthor(), UtilRegex.NAME) && UtilValidation.isValid(book.getBookType(), UtilRegex.NAME) && UtilValidation.isValid(book.getBookPrice(), UtilRegex.PRICE) ) {
				bookdb.add(book);
				setBookDB(bookdb);
				
			}
			
		}
		
	}



	@Override
	public void deleteBookbyId(Book book, String id) {
		if(!book.getBookId().isEmpty() && book.getBookId().equals(id)) {
			bookdb.deleteById(id);
		}

	}

	@Override
	public void searchBookbyId(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBookbyId() {
		// TODO Auto-generated method stub

	}

}
