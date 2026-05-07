package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Book;

public interface BookService {

	Book create(Book book);
	
	List<Book> getAll();
	
	Book get(Integer id);
}
