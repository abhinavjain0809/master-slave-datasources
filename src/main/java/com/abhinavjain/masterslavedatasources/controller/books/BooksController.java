package com.abhinavjain.masterslavedatasources.controller.books;

import com.abhinavjain.masterslavedatasources.entity.Books;
import com.abhinavjain.masterslavedatasources.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BooksController {
    private BooksService booksService;

    @Autowired
    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }

    @RequestMapping(value = "/books/add", consumes = {"application/json"}, method = RequestMethod.POST)
    public void addBook(@RequestBody Books book) {
        booksService.addBook(book);
    }

    @RequestMapping(value = "/books/find/master", method = RequestMethod.GET)
    public List getAllBooksFromMaster() {
        return booksService.getAllBooksFromMaster();
    }

    @RequestMapping(value = "/books/find/slave", method = RequestMethod.GET)
    public List getAllBooksFromSlave() {
        return booksService.getAllBooksFromSlave();
    }
}
