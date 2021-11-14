package com.gfg.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Book> getBookByAuthor(String author) {
        return bookReposirtory.findBookByAuthorName(author);
    }

    public List<Book> getBookByCost(int cost) {
        return bookReposirtory.findBookByCost(cost);
    }

    public void updateBookByCost(int id, int cost) {
        bookReposirtory.updateBook(id, cost);
    }
}
