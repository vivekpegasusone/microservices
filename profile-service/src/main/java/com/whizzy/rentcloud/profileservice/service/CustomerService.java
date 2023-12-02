package com.whizzy.rentcloud.profileservice.service;

import com.whizzy.rentcloud.commons.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);
    Customer fetchById(int id);
    List<Customer> fetchAllProfiles();
}
