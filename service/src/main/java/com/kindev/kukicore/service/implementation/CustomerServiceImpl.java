package com.kindev.kukicore.service.implementation;

import com.kindev.kukicore.domain.Customer;
import com.kindev.kukicore.repository.CustomerRepository;
import com.kindev.kukicore.service.CustomerService;
import com.kindev.kukicore.service.util.ResponseModel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;
    @Override
    public Customer getCustomerById(Long customerId) {
        log.info("Inside CustomerServiceImpl........");

        Optional<Customer> customer = customerRepository.findById(customerId);
        return customer.orElse(null);
    }

    @Override
    public ResponseModel<Customer> getAllCustomers() {
        ResponseModel<Customer> customers = new ResponseModel<>(customerRepository.findAll());
        return customers;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        if(customer != null){
            return customerRepository.save(customer);
        }
        return null;
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        if(customer != null){
            return customerRepository.save(customer);
        }
        return null;
    }

    @Override
    public boolean deleteCustomer(Long id) {
        if(id != null){
            customerRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
