package com.whizzy.rentcloud.profileservice.controller;

import com.whizzy.rentcloud.commons.model.Customer;
import com.whizzy.rentcloud.profileservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/services")
public class ProfileController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(value = "/profile")
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @GetMapping(value = "/profile/{id}")
    public Customer fetchCustomer(@PathVariable("id") int customerId) {
        return customerService.fetchById(customerId);
    }

    @GetMapping(value = "/profiles")
    public List<Customer> fetchAll() {
        return customerService.fetchAllProfiles();
    }

}
