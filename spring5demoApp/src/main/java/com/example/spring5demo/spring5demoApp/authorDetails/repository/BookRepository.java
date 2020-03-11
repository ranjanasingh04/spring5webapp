package com.example.spring5demo.spring5demoApp.authorDetails.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.spring5demo.spring5demoApp.authorDetails.model.Book;



public interface BookRepository extends CrudRepository<Book, Long>{

}
