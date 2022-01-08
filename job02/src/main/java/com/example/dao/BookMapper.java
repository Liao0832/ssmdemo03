package com.example.dao;

import com.example.mybatis.entity.Book;

import java.util.List;

public interface BooksMapper {
    int addBook(Book book);
    int deleteBookByName(String name);
    Book selectBookByName(String name);
    int updateBook(Book book);
    List<Book> allBooks();
}
