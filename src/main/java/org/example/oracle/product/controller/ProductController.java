package org.example.oracle.product.controller;

import lombok.RequiredArgsConstructor;
import org.example.oracle.product.model.ProductInfoDto;
import org.example.oracle.product.model.ProductRegDto;
import org.example.oracle.product.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    @PostMapping("/reg")
    public ResponseEntity<String> reg(
            @RequestBody ProductRegDto req
            ){
        productService.reg(req);
        return ResponseEntity.ok("성공");
    }

    @GetMapping("/all")
    public ResponseEntity<List<ProductInfoDto>> showAll(){
        List<ProductInfoDto> res = productService.showAll();
        return ResponseEntity.ok(res);
    }

}
