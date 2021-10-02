package com.kindev.kukicore.service;

import com.kindev.kukicore.domain.Customer;
import com.kindev.kukicore.service.util.ResponseModel;

public interface CustomerService {
    Customer getCustomerById(Long customerId);
    ResponseModel<Customer> getAllCustomers();
    Customer saveCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
    boolean deleteCustomer(Long id);
}
