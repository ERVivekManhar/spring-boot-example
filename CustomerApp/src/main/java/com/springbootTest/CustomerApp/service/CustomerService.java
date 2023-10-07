package com.springbootTest.CustomerApp.service;

import com.springbootTest.CustomerApp.pojo.Customer;

import java.util.UUID;

public interface CustomerService {

    public Customer getCustomerById(UUID customerId);
}
