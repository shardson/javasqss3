package com.aws.java.ecssqss3.service;

import com.aws.java.ecssqss3.model.Book;
import com.aws.java.ecssqss3.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    public BookRepository bookRepository;

    public List<Book> listBookByAuthor(){
        //return bookRepository.findAll();
        String author = "Tolkien SQS";
        return bookRepository.findByAuthor(author);
    }

}
