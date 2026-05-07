package com.example.demo.controller;

import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BookController {
	
	private final BookService bookService;

	@MutationMapping("createBook")
	public Book create(@Argument BookInput book) {
		Book b = book.toBook();
		return bookService.create(b);
	}
	
	@QueryMapping("getAllBooks")
	public List<Book> getAll() {
		return bookService.getAll();
	}
	
	@QueryMapping("getBook")
	public Book get(@Argument("id") Integer bookId) {
		return bookService.get(bookId);
	}
	
}

@Data
class BookInput {
	private String title;
	private String author;
	private String desc;
	private double price;
	private Integer pages;
	
	public Book toBook( ) {
		Book book = new Book();
		book.setTitle(title);
		book.setAuthor(author);
		book.setDesc(desc);
		book.setPrice(price);
		book.setPages(pages);
		return book;
	}
}

