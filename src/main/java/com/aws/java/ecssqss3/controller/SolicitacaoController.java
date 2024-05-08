package com.aws.java.ecssqss3.controller;

import com.aws.java.ecssqss3.model.Book;
import com.aws.java.ecssqss3.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SolicitacaoController {



    @Autowired
    public BookService bookService;

    public SolicitacaoController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/requestreport")
    public List<Book> getRequestReport(){

        return bookService.listBookByAuthor();

    }

}
