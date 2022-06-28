package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    private String customer_id;
    private String name;

    public Customer(){

    }
    public Customer(String customer_id, String name) {
        this.customer_id = customer_id;
        this.name = name;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
