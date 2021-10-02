package com.kindev.kukicore.repository;

import com.kindev.kukicore.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
