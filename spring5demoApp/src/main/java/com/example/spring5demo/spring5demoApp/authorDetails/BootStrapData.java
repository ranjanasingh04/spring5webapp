package com.example.spring5demo.spring5demoApp.authorDetails;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.spring5demo.spring5demoApp.authorDetails.model.Author;
import com.example.spring5demo.spring5demoApp.authorDetails.model.Book;
import com.example.spring5demo.spring5demoApp.authorDetails.model.Publisher;
import com.example.spring5demo.spring5demoApp.authorDetails.repository.AuthorRepository;
import com.example.spring5demo.spring5demoApp.authorDetails.repository.BookRepository;
import com.example.spring5demo.spring5demoApp.authorDetails.repository.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner{
	
	private final BookRepository bookRepo;
	private final  AuthorRepository authorRepo;
	private final PublisherRepository pubRepository;
	

	public BootStrapData(BookRepository bookRepo, AuthorRepository authorRepo,PublisherRepository pubRepository) {
		super();
		this.bookRepo = bookRepo;
		this.authorRepo = authorRepo;
		this.pubRepository = pubRepository;
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("Inside BootStrap RUn method");
		Author author1 = new Author("Ranjana",23,"female");
		Book book1 = new Book("Domain Driven","1234");
		Publisher publisher = new Publisher("ranjana","lux","Merl","Luxembourg","123j");
		
		author1.getBooks().add(book1);
		book1.getAuthor().add(author1);
		publisher.getBooks().add(book1);
		
		authorRepo.save(author1);
		bookRepo.save(book1);
		pubRepository.save(publisher);
		
		Author author2 = new Author("Rod",45,"Male");
		Book book2 = new Book("J2ee Design","1235666");
		Publisher publisher2 = new Publisher("pawan","lux","Merl","Luxembourg","123j");
		
		author2.getBooks().add(book2);
		book2.getAuthor().add(author2);
		publisher2.getBooks().add(book2);
		authorRepo.save(author2);
		bookRepo.save(book2);
		pubRepository.save(publisher2);
		
		System.out.println("Started in BootStrap");
		System.out.println("Count" +bookRepo.count());
		System.out.println("Count publisher"+ pubRepository.count());
		
		
	}

}
