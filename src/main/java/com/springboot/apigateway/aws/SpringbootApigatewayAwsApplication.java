package com.springboot.apigateway.aws;

import com.springboot.apigateway.aws.domain.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/book")
public class SpringbootApigatewayAwsApplication
{

	List<Book> books = new ArrayList<Book>();

	@PostMapping
	public Book addBook(@RequestBody  Book book)
	{
		books.add(book);
		return book;
	}

	@GetMapping
	public List<Book> getBooks()
	{
		return books;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApigatewayAwsApplication.class, args);
	}

}
