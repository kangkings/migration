package org.example.oracle.product.service;

import lombok.RequiredArgsConstructor;
import org.example.oracle.product.model.Product;
import org.example.oracle.product.model.ProductInfoDto;
import org.example.oracle.product.model.ProductRegDto;
import org.example.oracle.product.repository.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;


    public void reg(ProductRegDto req) {
        Product product = Product.builder()
                .name(req.getName())
                .price(req.getPrice())
                .stockQuantity(req.getStockQuantity())
                .build();
        repository.save(product);
    }

    public List<ProductInfoDto> showAll() {
        List<ProductInfoDto> res = repository.findAll()
                .stream().map(product -> ProductInfoDto.builder()
                        .name(product.getName())
                        .price(product.getPrice())
                        .stockQuantity(product.getStockQuantity())
                        .build())
                .collect(Collectors.toList());
        return res;
    }
}
