package com.kindev.kukicore.controller;

import com.kindev.kukicore.domain.Customer;
import com.kindev.kukicore.domain.dto.CustomerDto;
import com.kindev.kukicore.domain.dto.CustomerForReservationDto;
import com.kindev.kukicore.domain.mapstruct.MapStructMapper;
import com.kindev.kukicore.service.CustomerService;
import com.kindev.kukicore.service.util.ResponseModel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/api/v1/customers")
public class CustomerController {

    private CustomerService customerService;
    private MapStructMapper mapStructMapper;

    @GetMapping("/health")
    public String health() {
        return "ok";
    }

    @GetMapping("")
    public ResponseModel<CustomerDto> getAllCustomers() {
        log.info("Call to Inside getAllCustomers CustomerController........");
        ResponseModel<Customer> customers = customerService.getAllCustomers();
        ResponseModel<CustomerDto> customerDtos = new ResponseModel<>();
        customerDtos.setContent(
                customers.getContent().parallelStream()
                .map(customer -> mapStructMapper.mapCustomerToCustomerDto(customer))
                .collect(Collectors.toList())
        );
        return customerDtos;
    }

    @GetMapping("/customer")
    public CustomerDto getCustomer(@RequestHeader("id") Long id) {
        log.info("Call to Inside getCustomerById Inside CustomerController........");
        Customer customer = customerService.getCustomerById(id);
        CustomerDto customerDto = mapStructMapper.mapCustomerToCustomerDto(customer);
        return customerDto;
    }
    @PostMapping("")
    public CustomerDto createCustomer(@RequestBody CustomerForReservationDto customerForReservationDto) {
        log.info("Call to Inside createCustomer Inside CustomerController........");
        return mapStructMapper.mapCustomerToCustomerDto(
                customerService.saveCustomer(mapStructMapper.mapCustomerForReservationDtoToCustomer(customerForReservationDto))
        );
    }
    @PostMapping("/update")
    public CustomerDto updateCustomer(@RequestBody CustomerDto customerDto) {
        log.info("Call to Inside createCustomer Inside CustomerController........");
        return mapStructMapper.mapCustomerToCustomerDto(
                customerService.saveCustomer(mapStructMapper.mapCustomerDtoToCustomer(customerDto))
        );
    }
    @PostMapping("/delete")
    public boolean deleteCustomer(@RequestHeader("id") Long id) {
        log.info("Call to Inside createCustomer Inside CustomerController........");
        return customerService.deleteCustomer(id);
    }
}
