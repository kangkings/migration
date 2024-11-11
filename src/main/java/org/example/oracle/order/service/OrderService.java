package org.example.oracle.order.service;

import lombok.RequiredArgsConstructor;
import org.example.oracle.customer.model.Customer;
import org.example.oracle.customer.repository.CustomerRepository;
import org.example.oracle.order.model.Order;
import org.example.oracle.order.model.request.OrderRegisterReq;
import org.example.oracle.order.repository.OrderRepository;
import org.example.oracle.product.model.Product;
import org.example.oracle.product.repository.ProductRepository;

import java.util.List;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository repository;
    private final CustomerRepository customerRepository;
    private final ProductRepository productRepository;

    public void registerOrder(OrderRegisterReq orderRegisterReq) {

        Customer customer = customerRepository.findById(orderRegisterReq.getCustomerId())
                .orElseThrow(() -> new IllegalArgumentException("Invalid customer ID"));

        List<Product> products = productRepository.findAllById(orderRegisterReq.getProductList());
        if (products.isEmpty()) {
            throw new IllegalArgumentException("Invalid product IDs");
        }


    }


}
