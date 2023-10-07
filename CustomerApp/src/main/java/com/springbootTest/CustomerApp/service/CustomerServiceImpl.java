package com.springbootTest.CustomerApp.service;

import com.springbootTest.CustomerApp.pojo.Customer;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class CustomerServiceImpl implements CustomerService{
    @Override
    public Customer getCustomerById(UUID customerId) {
        return Customer.builder().customerId(customerId).customerName("vivek").build();
    }
}
