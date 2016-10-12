package com.umeox.sc.book.repository;

import com.umeox.sc.book.domain.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>{
	
}
