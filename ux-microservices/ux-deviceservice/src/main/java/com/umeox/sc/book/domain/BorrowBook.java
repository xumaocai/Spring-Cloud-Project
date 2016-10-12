package com.umeox.sc.book.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "book_borrow")
public class BorrowBook extends BaseEntity{

	private static final long serialVersionUID = 1437641438581706409L;
	
	private Book book;
	private String username;
	
	public BorrowBook() {
	}
	public BorrowBook(Book book,String username){
		this.book = book;
		this.username = username;
	}
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "book_id")
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
