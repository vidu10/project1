package com.example.demo.service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;
@Service
public class CustomerService {
    private CustomerRepository customerRepository;
    public void addCustomer(Customer customer){
        customerRepository.save(customer);
    }
}
