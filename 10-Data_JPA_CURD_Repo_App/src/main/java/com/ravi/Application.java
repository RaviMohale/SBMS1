package com.ravi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ravi.entity.Book;
import com.ravi.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
			BookRepository repo = ctxt.getBean(BookRepository.class);
			System.out.println(repo.getClass().getName());
			
			/*
			 * Book b = new Book(); b.setBookId(105); b.setBookName("Geo Book");
			 * b.setBookPrice(1500.00);
			 * 
			 * 
			 * Book b1 = new Book(); b1.setBookId(106); b1.setBookName("History Book");
			 * b1.setBookPrice(1100.00);
			 */
			//System.out.println("save use for  save and update");
			//repo.save(b);
			//repo.save(b1);
			
			//System.out.println("saveAll for multiple record save");
			/*
			 * repo.saveAll(Arrays.asList(b,b1));
			 * System.out.println("Record inserted.....");
			 */
			
			
			/*System.out.println("find the record by id");
			 * Optional<Book> findById = repo.findById(101);
			 * System.out.println(findById.get());
			 */
			/*
			 * System.out.println("check record is present or not"); boolean status =
			 * repo.existsById(105); System.out.println(status);
			 */
			/*
			 * System.out.println("counting no. of record present in table");
			 * System.out.println("Records count : "+repo.count());
			 */
			
			/*
			 * System.out.println("find multiple record "); List<Book> findAllById =
			 * repo.findAllById(Arrays.asList(101,104,105)); for(Book b : findAllById) {
			 * System.out.println(b); }
			 */
			
			/*
			 * System.out.println("find all record from table"); List<Book> findAll =
			 * repo.findAll(); for(Book b1 : findAll) { System.out.println(b1); }
			 */
			
			//System.out.println("delete the record by id");
			//repo.deleteById(101);
			/*
			 * if(repo.existsById(105)) { repo.deleteById(105); }else {
			 * System.out.println("record not exit"); }
			 */
			
			/*
			 * System.out.println(" custom method book price greater than or equals...");
			 * List<Book> findByBookPriceGreaterThan =
			 * repo.findByBookPriceGreaterThan(1400.00);
			 * 
			 * for(Book b1 : findByBookPriceGreaterThan) { System.out.println(b1); }
			 */
			
			/*
			 * System.out.println("find book by name..."); List<Book> findByBookName =
			 * repo.findByBookName("PythonBook"); for(Book b1 : findByBookName) {
			 * System.out.println(b1); }
			 */
			/*
			 * System.out.println("find book by price less than");
			 * 
			 * List<Book> findByBookPriceLessThan = repo.findByBookPriceLessThan(1500.00);
			 * for(Book b : findByBookPriceLessThan) { System.out.println(b); }
			 */
			
			System.out.println("find book using native query");
			
			List<Book> allBooks = repo.getAllBooks();
			for(Book b :allBooks) {
				System.out.println(b);
			}
			
			System.out.println("=============HQL Query.=========");
			List<Book> books = repo.getBooks();
			for(Book b1 : books) {
				System.out.println(b1);
			}
			
	}

}
