package com.kindev.customer.controller;

import com.kindev.customer.domain.aggregate.Customer;
import com.kindev.customer.domain.service.CustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
public class CustomerController {

    private CustomerService customerService;

    @GetMapping("customer/{customerId}")
    public Customer getCustomer(@PathVariable Integer customerId) {
        log.info("Inside CustomerController........");
        return customerService.getCustomerById(customerId);
    }
}
