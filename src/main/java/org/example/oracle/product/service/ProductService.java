package org.example.oracle.product.service;

import lombok.RequiredArgsConstructor;
import org.example.oracle.product.repository.ProductRepository;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;


}
