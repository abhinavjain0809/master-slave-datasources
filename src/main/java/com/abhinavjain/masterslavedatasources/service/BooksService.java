package com.abhinavjain.masterslavedatasources.service;

import com.abhinavjain.masterslavedatasources.dao.BooksDAO;
import com.abhinavjain.masterslavedatasources.entity.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {
    private BooksDAO booksDAO;

    @Autowired
    public BooksService(BooksDAO booksDAO) {
        this.booksDAO = booksDAO;
    }

    public void addBook(Books book) {
        booksDAO.saveAndFlush(book);
    }

    public List getAllBooksFromMaster() {
        return booksDAO.getAllBooksFromMaster();
    }

    public List getAllBooksFromSlave() {
        return booksDAO.getAllBooksFromSlave();
    }
}
