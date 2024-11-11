package org.example.oracle.order.controller;

import lombok.RequiredArgsConstructor;
import org.example.oracle.order.model.request.OrderRegisterReq;
import org.example.oracle.order.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/register")
    public ResponseEntity<String> register(
            @RequestBody OrderRegisterReq orderRegisterReq
    ) {
        orderService.registerOrder(orderRegisterReq);
        return ResponseEntity.ok("성공");
    }


}
