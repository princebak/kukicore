package com.kindev.customer.domain.service;

import com.kindev.customer.domain.aggregate.Customer;

public interface CustomerService {
    Customer getCustomerById(Integer customerId);
}
