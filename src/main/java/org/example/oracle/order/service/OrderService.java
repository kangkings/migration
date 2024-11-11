package org.example.oracle.order.service;

import lombok.RequiredArgsConstructor;
import org.example.oracle.order.repository.OrderRepository;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository repository;


}
