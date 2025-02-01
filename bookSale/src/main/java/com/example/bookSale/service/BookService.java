package com.example.bookSale.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookSale.entity.BookEntity;
import com.example.bookSale.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository bookRepository;

	public List<BookEntity> findAllBooks() {
		return bookRepository.findAll();
	}

	public Optional<BookEntity> findByIdBook(Integer id) {
		return bookRepository.findById(id);
	}
	
	public void saveBook(BookEntity bookEntity) {
		bookRepository.save(bookEntity);
	}
}
