package com.example.demo.service;

import java.util.HashSet;

import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
@Service
public class BookServiceImpl implements BookService {

	HashSet<Book> bookList = new HashSet<Book>();

	@Override
	public HashSet<Book> findAllBook() {
		// TODO Auto-generated method stub
		if (bookList.isEmpty())
			return null;
		else
			return bookList;
	}

	@Override
	public Book findBookByID(long id) {
		Book book = bookList.stream().filter(b -> b.getId() == id).findAny().orElse(null);
		return book;
	}

	@Override
	public String addBook(Book b) {
		// TODO Auto-generated method stub
		bookList.add(b);
		return "Book Added:"+b.getId()+"->"+b.getName();

	}

	@Override
	public String deleteAllData() {
		// TODO Auto-generated method stub
		bookList.clear();
		return "All Books are deleted";

	}

}
