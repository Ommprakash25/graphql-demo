package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
	
	private final BookRepository bookRepository;

	@Override
	public Book create(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public List<Book> getAll() {
		return bookRepository.findAll();
	}

	@Override
	public Book get(Integer id) {
		return bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found with id: " + id));
	}

}
