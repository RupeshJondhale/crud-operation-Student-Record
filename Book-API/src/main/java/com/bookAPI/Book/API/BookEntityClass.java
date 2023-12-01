package com.bookAPI.Book.API;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BookEntityClass {
	
	@Id
	int id;
	String title;
	int price;
	String author;
	String typeofbook;
	Date publishdate;
	public BookEntityClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookEntityClass(int id, String title, int price, String author, String typeofbook, Date publishdate) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.author = author;
		this.typeofbook = typeofbook;
		this.publishdate = publishdate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTypeofbook() {
		return typeofbook;
	}
	public void setTypeofbook(String typeofbook) {
		this.typeofbook = typeofbook;
	}
	public Date getPublishdate() {
		return publishdate;
	}
	public void setPublishdate(Date publishdate) {
		this.publishdate = publishdate;
	}
	@Override
	public String toString() {
		return "BookEntityClass [id=" + id + ", title=" + title + ", price=" + price + ", author=" + author
				+ ", typeofbook=" + typeofbook + ", publishdate=" + publishdate + "]";
	}
}