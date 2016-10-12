package com.umeox.sc.book.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book extends BaseEntity{
	private static final long serialVersionUID = 8761577324075103929L;
	
	private String title;//标题
	private String intro;//简介
	private String author;//作者
	
	public Book() {
	}
	public Book(String title,String intro,String author){
		this.title = title;
		this.intro = intro;
		this.author = author;
	}
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
