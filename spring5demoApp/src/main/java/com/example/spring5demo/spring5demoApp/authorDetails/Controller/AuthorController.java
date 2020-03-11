package com.example.spring5demo.spring5demoApp.authorDetails.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.spring5demo.spring5demoApp.authorDetails.repository.AuthorRepository;

@Controller
public class AuthorController {
	
	private AuthorRepository authRepo;
	public AuthorController(AuthorRepository authRepo) {
		super();
		this.authRepo = authRepo;
		
	}
	@RequestMapping("/authors") 
	public String getAuthors(Model model) {
		model.addAttribute("authors", authRepo.findAll());
		return "author/list2";
	}

}
