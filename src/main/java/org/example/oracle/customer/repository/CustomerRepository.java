package org.example.oracle.customer.repository;

import org.example.oracle.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {


}
