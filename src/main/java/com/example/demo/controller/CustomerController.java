package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;
    @GetMapping("/customers")
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }
    @GetMapping ("/customers/{id}")
    public Optional<Customer> getCustomerById(@PathVariable(value = "id") Integer id){
        return customerRepository.findById(id);
    }
}
