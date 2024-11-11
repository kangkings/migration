package org.example.oracle.customer.service;

import lombok.RequiredArgsConstructor;
import org.example.oracle.customer.repository.CustomerRepository;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository repository;


}
