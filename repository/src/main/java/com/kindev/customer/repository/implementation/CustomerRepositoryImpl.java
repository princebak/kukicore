package com.kindev.customer.repository.implementation;

import com.kindev.customer.domain.aggregate.Customer;
import com.kindev.customer.domain.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public Customer getCustomerById(Integer customerId) {
        log.info("Inside CustomerRepositoryImpl........");
        // This is just for Test -- I can replace this code to retrieve from database
        Customer customer = new Customer(100, "A New Customer");
        return customer;
    }

}
