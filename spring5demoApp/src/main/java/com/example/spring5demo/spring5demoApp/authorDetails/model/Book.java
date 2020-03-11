package com.example.spring5demo.spring5demoApp.authorDetails.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	private String title;
	private String isbn;
	
	
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	@ManyToMany
	@JoinTable(name="author_book" ,joinColumns=@JoinColumn(name="book_id"),
	inverseJoinColumns = @JoinColumn(name="author_id"))
	Set<Author> authors= new HashSet<Author>();
	
	@ManyToOne
	private Publisher publisher ;
	
	
	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Book() {
	
	}
	
	public Book(String title, String isbn) {
		
		this.title = title;
		this.isbn = isbn;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Set<Author> getAuthor() {
		return authors;
	}
	public void setAuthor(Set<Author> authors) {
		this.authors = authors;
	}
	
	

	@Override
	public String toString() {
		return "Book [Id=" + Id + ", title=" + title + ", isbn=" + isbn + ", authors=" + authors + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}
	

}
