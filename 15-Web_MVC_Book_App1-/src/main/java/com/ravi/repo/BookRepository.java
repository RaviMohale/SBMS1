package com.ravi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravi.entity.Book;

public interface BookRepository  extends JpaRepository<Book, Integer> {

}
