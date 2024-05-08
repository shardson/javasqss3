package com.aws.java.ecssqss3.repository;

import com.aws.java.ecssqss3.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer>{

    List<Book> findByAuthor(String author);

}
