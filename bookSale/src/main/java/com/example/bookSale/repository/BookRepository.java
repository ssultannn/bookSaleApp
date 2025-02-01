package com.example.bookSale.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookSale.entity.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Integer> {

}
