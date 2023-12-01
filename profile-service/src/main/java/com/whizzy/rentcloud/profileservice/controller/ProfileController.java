package com.whizzy.rentcloud.profileservice.controller;

import com.whizzy.rentcloud.commons.model.Customer;
import com.whizzy.rentcloud.profileservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/services")
public class ProfileController {

    @Autowired
    private CustomerService customerService;
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

}
