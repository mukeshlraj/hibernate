package com.gfg.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookReposirtory bookReposirtory;

    public void createBook(Book book) {
        bookReposirtory.save(book);
    }

    public Book getBook(long id) {
        return bookReposirtory.findById(id).orElse(null);
    }

    public void deleteBook(long id) {
        bookReposirtory.deleteById(id);
    }
}
