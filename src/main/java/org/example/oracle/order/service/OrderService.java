package org.example.oracle.order.service;

import lombok.RequiredArgsConstructor;
import org.example.oracle.customer.model.Customer;
import org.example.oracle.customer.repository.CustomerRepository;
import org.example.oracle.order.model.Order;
import org.example.oracle.order.model.request.OrderRegisterReq;
import org.example.oracle.order.model.response.OrderReadRes;
import org.example.oracle.order.repository.OrderRepository;
import org.example.oracle.product.model.Product;
import org.example.oracle.product.repository.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final CustomerRepository customerRepository;
    private final ProductRepository productRepository;

    // 등록
    public void registerOrder(OrderRegisterReq orderRegisterReq) {

        Customer customer = customerRepository.findById(orderRegisterReq.getCustomerId()).orElseThrow();

        List<Product> productList = productRepository.findAllById(orderRegisterReq.getProductList());
        if (productList.isEmpty()) {
            throw new IllegalArgumentException("존재하지 않는 상품");
        }

        Order order = Order.builder()
                .orderDate(orderRegisterReq.getOrderDate())
                .totalAmount(orderRegisterReq.getTotalAmount())
                .customer(customer)
                .build();

        orderRepository.save(order);
    }

    // 조회
    public List<OrderReadRes> readOrderList() {

        return orderRepository.findAll().stream()
                .map(order -> OrderReadRes.builder()
                        .idx(order.getIdx())
                        .orderDate(order.getOrderDate())
                        .totalAmount(order.getTotalAmount())
                        .customerId(order.getCustomer().getIdx())
                        .build())
                .collect(Collectors.toList());
    }
}
