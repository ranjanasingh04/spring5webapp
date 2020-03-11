package com.example.spring5demo.spring5demoApp.authorDetails.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.spring5demo.spring5demoApp.authorDetails.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
