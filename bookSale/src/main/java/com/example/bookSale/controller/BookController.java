package com.example.bookSale.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookSale.entity.BookEntity;
import com.example.bookSale.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
	@Autowired
	BookService bookService;

	@GetMapping("/get-all")
	public List<BookEntity> findAll() {
		return bookService.findAllBooks();
	
	}

	@GetMapping("/{id}")
	public Optional<BookEntity> findById(@PathVariable Integer id) {
		return bookService.findByIdBook(id);
	}

	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public void save(@RequestBody BookEntity bookEntity) {
		bookService.saveBook(bookEntity);
	}

}
