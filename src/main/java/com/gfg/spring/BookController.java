package com.gfg.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/book")
    public void createBook(@RequestBody Book book) {
        bookService.createBook(book);
    }

    @GetMapping("/book/{book_id}")
    public Book getBookbyId(@PathVariable("book_id") long bookId) {
        return bookService.getBook(bookId);
    }

    @GetMapping("/books")
    public List<Book> getBooks() {
        return null;
    }

    @GetMapping("/bookAuthor")
    public List<Book> getBookByAuthor(@RequestParam("author") String author) {
        return bookService.getBookByAuthor(author);
    }

    public List<Book> getBookByCost(@RequestParam("cost") int cost) {
        return bookService.getBookByCost(cost);
    }

    @PutMapping("/book")
    public void updateBook(@RequestParam("id") int id, @RequestParam("cost") int cost) {
        bookService.updateBookByCost(id, cost);
    }

    @DeleteMapping("/book/{bookID}")
    public void deleteBook(@PathVariable("bookID") int id) {
        bookService.deleteBook(id);
    }
}
