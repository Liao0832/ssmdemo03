package com.example.service.service;

import com.example.mybatis.entity.Book;

import java.util.List;

public interface bookService {
    int addBook(Book books);
    int deleteBookByName(String name);
    Book selectBookByName(String name);
    int updateBook(Book book);
    List<Book> allBooks();
}
