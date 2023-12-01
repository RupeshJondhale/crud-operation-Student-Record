package com.bookAPI.Book.API;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	ArrayList<BookEntityClass> al = new ArrayList<BookEntityClass>();

	@Autowired
	SessionFactory sf;
	BookEntityClass bookEntity;

	@RequestMapping("showbyauthor/{author}")

	BookEntityClass showbyauthor(@PathVariable String author) {
		BookEntityClass se = new BookEntityClass();
		Session ss = sf.openSession();
		bookEntity = ss.get(BookEntityClass.class, author);
		System.out.println(bookEntity);
		BookEntityClass book = bookEntity;
		for (BookEntityClass bk : al) {
			if (bk.author == author) {
				book = bk;
			}
		}
		return book;
	}

	@RequestMapping("showbytype/{type}")
	BookEntityClass singleRecord(@PathVariable String type) {
		BookEntityClass se = new BookEntityClass();
		for (BookEntityClass bookEntity : al) {
			if (bookEntity.typeofbook == type)
				se = bookEntity;
		}
		return se;
	}

	@RequestMapping("showbyname/{id}")
	BookEntityClass showbyname(@PathVariable int id) {
		Session ss = sf.openSession();
		bookEntity = ss.get(BookEntityClass.class, id);
		System.out.println(bookEntity);
		BookEntityClass book = bookEntity;
		for (BookEntityClass bk : al) {
			if (bk.id == id) {
				book = bk;

			}
		}
		return book;
	}

	@RequestMapping("showbypublishdate/{publishdate}")
	BookEntityClass singleRecord(@PathVariable Date publishdate) {
		Session ss = sf.openSession();
		bookEntity = ss.get(BookEntityClass.class, publishdate);
		System.out.println(bookEntity);
		BookEntityClass book = bookEntity;
		for (BookEntityClass bk : al) {
			if (bk.publishdate == publishdate) {
				book = bk;

			}
		}
		return book;

	}

	// @RequestMapping("showbyid/{id}")
	BookEntityClass singleRecord(@PathVariable int id) {
		BookEntityClass se = new BookEntityClass();
		for (BookEntityClass bookEntity : al) {
			if (bookEntity.id == id)
				se = bookEntity;
		}
		return se;

	}
}