package com.dev.CustomerService.repositories;

import com.dev.CustomerService.entity.customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface customerRepository extends JpaRepository<customer,Long> {
}
