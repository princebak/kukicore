package com.kindev.customer.domain.repository;

import com.kindev.customer.domain.aggregate.Customer;

public interface CustomerRepository {
    Customer getCustomerById(Integer customerId);
}
