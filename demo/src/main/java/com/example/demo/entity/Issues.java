package com.example.demo.entity;

import javax.persistence.*;

@Entity
public class Issues {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int iid;
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Books books;
    private String status;

    public Issues(){

    }
    public Issues(Customer customer, Books books, String status) {
        this.customer = customer;
        this.books = books;
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Books getBooks() {
        return books;
    }

    public void setBooks(Books books) {
        this.books = books;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
