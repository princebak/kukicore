package com.kindev.customer.service.implementation;

import com.kindev.customer.domain.aggregate.Customer;
import com.kindev.customer.domain.repository.CustomerRepository;
import com.kindev.customer.domain.service.CustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;
    @Override
    public Customer getCustomerById(Integer customerId) {
        log.info("Inside CustomerServiceImpl........");
        Customer customer = customerRepository.getCustomerById(customerId);
        return customer;
    }
}
