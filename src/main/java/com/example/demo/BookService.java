package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookDetailRepository bookDetailRepository;

    public BookService(BookRepository bookRepository, BookDetailRepository bookDetailRepository) {
        this.bookRepository = bookRepository;
        this.bookDetailRepository = bookDetailRepository;
    }


    @PostConstruct
    private void loadData()
    {
        BookDetail bookDetail=new BookDetail();
        Book book=new Book();
        bookDetail.setBook(book);
        book.setBookDetail(bookDetail);
        book.setBookName("Java");
        bookDetail.setNoofPages(1234);
        bookDetailRepository.save(bookDetail);
        bookRepository.save(book);

    }
}
