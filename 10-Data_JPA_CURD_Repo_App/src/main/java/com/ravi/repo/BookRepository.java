package com.ravi.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ravi.entity.Book;

public interface BookRepository  extends JpaRepository<Book, Integer>{

	/*
	 * // select * from book where book_Price > : bookPrice public List<Book>
	 * findByBookPriceGreaterThan(double d);
	 * 
	 * // select * form book where book_Price < : bookPrice public List<Book>
	 * findByBookPriceLessThan(Double d1);
	 * 
	 * // select * from book where book_Name = : bookName public List<Book>
	 * findByBookName(String bookName);
	 */
		// below are custom query Native Query NQL
	@Query(value ="select * from book",nativeQuery = true)
	public List<Book> getAllBooks();
	
	//below are HQL query here Book is entity class name
	@Query("from Book")
	public List<Book> getBooks();
}
