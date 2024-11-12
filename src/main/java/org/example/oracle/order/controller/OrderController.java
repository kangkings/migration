package org.example.oracle.order.controller;

import lombok.RequiredArgsConstructor;
import org.example.oracle.order.model.request.OrderRegisterReq;
import org.example.oracle.order.model.response.OrderReadRes;
import org.example.oracle.order.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;
gir
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody OrderRegisterReq orderRegisterReq) {
        orderService.registerOrder(orderRegisterReq);
        return ResponseEntity.ok("성공");
    }

    @GetMapping("/read")
    public ResponseEntity<List<OrderReadRes>> read() {
        return ResponseEntity.ok(orderService.readOrderList());
    }


}
