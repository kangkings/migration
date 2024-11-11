package org.example.oracle.product.repository;

import org.example.oracle.customer.model.Customer;
import org.example.oracle.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface ProductRepository extends JpaRepository<Product,Long> {


}
