package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class BookDetail {

    @Id
    private Long id;
    private int noofPages;

    @OneToOne
    @JoinColumn(name="id")
    private Book book;

    public BookDetail() {
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNoofPages() {
        return noofPages;
    }

    public void setNoofPages(int noofPages) {
        this.noofPages = noofPages;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "BookDetail{" +
                "id=" + id +
                ", noofPages=" + noofPages +
                ", book=" + book +
                '}';
    }
}
