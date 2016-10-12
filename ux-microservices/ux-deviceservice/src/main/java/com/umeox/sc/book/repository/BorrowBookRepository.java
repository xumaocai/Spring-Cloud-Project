package com.umeox.sc.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.umeox.sc.book.domain.BorrowBook;

public interface BorrowBookRepository extends JpaRepository<BorrowBook, Long>{

}
