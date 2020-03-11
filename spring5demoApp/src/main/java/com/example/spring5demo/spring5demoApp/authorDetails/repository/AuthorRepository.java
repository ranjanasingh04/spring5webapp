package com.example.spring5demo.spring5demoApp.authorDetails.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.spring5demo.spring5demoApp.authorDetails.model.Author;



public interface AuthorRepository  extends CrudRepository<Author, Long>{

}
