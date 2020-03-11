package com.example.spring5demo.spring5demoApp.authorDetails.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.spring5demo.spring5demoApp.authorDetails.repository.BookRepository;



@Controller
public class BookController {
	
	private final BookRepository bookRepository;
	
	
	public BookController(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}


	@RequestMapping("/books")
	public String getBooks(Model model) {
		model.addAttribute("books", bookRepository.findAll());
		return "book/list";
		
	}

}
