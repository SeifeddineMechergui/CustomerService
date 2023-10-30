package com.dev.CustomerService.repositories;

import com.dev.CustomerService.entity.customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullCustomer",types = customer.class)
public interface customerProjection extends Projection {
    public Long getId();
    public String getName();
    public String getEmail();
}
