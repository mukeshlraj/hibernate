package com.gfg.spring;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookReposirtory extends JpaRepository<Book, Long> {
}
