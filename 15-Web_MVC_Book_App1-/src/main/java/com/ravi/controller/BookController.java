package com.ravi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ravi.entity.Book;
import com.ravi.repo.BookRepository;

@Controller
public class BookController {
	
	@Autowired
	private BookRepository repo;
	
	/* @GetMapping("/book")
	public ModelAndView getBookById( @RequestParam("id") Integer id) {
		
		System.out.println("Id:"+id);
		ModelAndView mav = new ModelAndView();
		
		Optional<Book>	findbyId	=repo.findById(id);
		
		if(findbyId.isPresent()) {
			Book bookobj = findbyId.get();
			System.out.println(bookobj);
			//sending data to view
			mav.addObject("book", bookobj);
			}
			// setting view page name
			mav.setViewName("index");
			return mav;
		}
		*/	
		
	@GetMapping("/book")
	public String getBookById( @RequestParam("id") Integer id, Model model) {

		Optional<Book>	findbyId	=repo.findById(id);
		
		if(findbyId.isPresent()) {
			Book bookobj = findbyId.get();
			model.addAttribute("book",bookobj);
		}
	return "index";
	
		}
	
	}
