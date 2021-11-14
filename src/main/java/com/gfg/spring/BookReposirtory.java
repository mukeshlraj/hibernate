package com.gfg.spring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface BookReposirtory extends JpaRepository<Book, Long> {
    // Find all the books written by an author

    @Query(value = "from Book where authorName= :author")
    List<Book> findBookByAuthorName(String author);

    @Query(value = "select * from books_table where cost = :cost", nativeQuery = true)
    List<Book> findBookByCost(int cost);

    @Modifying
    @Transactional
    @Query(value = "update books_table set cost=?2 where id=?1", nativeQuery = true)
    void updateBook(int id, int cost);
}
