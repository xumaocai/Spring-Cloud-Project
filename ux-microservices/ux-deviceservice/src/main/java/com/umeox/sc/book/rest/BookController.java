package com.umeox.sc.book.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.umeox.sc.book.domain.Book;
import com.umeox.sc.book.domain.BorrowBook;
import com.umeox.sc.book.repository.BookRepository;
import com.umeox.sc.book.repository.BorrowBookRepository;
import com.umeox.sc.common.client.user.UserClient;


@RestController
@RequestMapping(value = "/book")
public class BookController {
	@Autowired private BookRepository bookRepository;
	@Autowired private BorrowBookRepository borrowBookRepository;
	@Autowired private UserClient userClient;
	
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public String find(@RequestParam(value = "title") String title,
						@RequestParam(value = "intro") String intro,
						@RequestParam(value = "author") String author){
		System.out.println(title);
		Book book = new Book(title, intro, author);
		bookRepository.save(book);
		return "success";
	}
	
	@RequestMapping(value = "/borrow",method = RequestMethod.POST)
	public String borrow(@RequestParam(value = "bookId") long bookId){
		Book book = bookRepository.findOne(bookId);
		//根据前端传递过来的token，从缓存获取到用户id
		String username = userClient.findById(1L);
		if (book == null || username == null) {
			return "fail";
		}
		BorrowBook borrowBook = new BorrowBook(book, username);
		borrowBookRepository.save(borrowBook);
		return "success";
	}
}
