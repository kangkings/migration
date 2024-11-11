package org.example.oracle.customer.controller;

import lombok.RequiredArgsConstructor;
import org.example.oracle.customer.model.CustomerShowDto;
import org.example.oracle.customer.model.SignupDto;
import org.example.oracle.customer.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/signup")
    public ResponseEntity<String> signup(
            @RequestBody SignupDto req
            ){
        customerService.signup(req);
        return ResponseEntity.ok("성공");
    }

    @GetMapping("/all")
    public ResponseEntity<List<CustomerShowDto>> showAll(){
        List<CustomerShowDto> res = customerService.showAll();

        return ResponseEntity.ok(res);
    }
}
