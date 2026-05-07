package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;

@SpringBootApplication
public class GraphqlDemoApplication implements CommandLineRunner {
	
	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book book1 = new Book();
		book1.setTitle("The Great Gatsby");
		book1.setAuthor("F. Scott Fitzgerald");
		book1.setDesc("The Great Gatsby is a novel by American writer F. Scott Fitzgerald. It was first published in 1925");
		book1.setPages(2000);
		book1.setPrice(100.0);
		bookService.create(book1);
		
		Book book2 = new Book();
		book2.setTitle("The Lord of the Rings");
		book2.setAuthor("J. R. R. Tolkien");
		book2.setDesc("The Lord of the Rings is an epic high-fantasy novel written by English author and scholar J. R. R. Tolkien.");
		book2.setPages(20000);
		book2.setPrice(1000.0);
		bookService.create(book2);
		
		Book book3 = new Book();
		book3.setTitle("The Catcher in the Rye");
		book3.setAuthor("J. D. Salinger");
		book3.setDesc("The Catcher in the Rye is a novel by J. D. Salinger, partially published in serial form in 1945–1946 and as a novel in 1951.");
		book3.setPages(5000);
		book3.setPrice(500.0);
		bookService.create(book3);
	}

}
