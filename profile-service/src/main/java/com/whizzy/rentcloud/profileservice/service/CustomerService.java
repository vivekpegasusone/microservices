package com.whizzy.rentcloud.profileservice.service;

import com.whizzy.rentcloud.commons.model.Customer;
import org.springframework.stereotype.Service;

public interface CustomerService {
    Customer save(Customer customer);
}
