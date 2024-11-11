package org.example.oracle.order.repository;

import org.example.oracle.customer.model.Customer;
import org.example.oracle.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface OrderRepository extends JpaRepository<Order,Long> {


}
