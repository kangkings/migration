package org.example.oracle.customer.service;

import lombok.RequiredArgsConstructor;
import org.example.oracle.customer.model.Customer;
import org.example.oracle.customer.model.CustomerShowDto;
import org.example.oracle.customer.model.SignupDto;
import org.example.oracle.customer.repository.CustomerRepository;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository repository;

    public void signup(SignupDto req){
        Customer customer = Customer.builder()
                .name(req.getName())
                .email(req.getEmail())
                .createdAt(Timestamp.valueOf(LocalDateTime.now()))
                .build();
        repository.save(customer);
    }

    public List<CustomerShowDto> showAll() {
        List<CustomerShowDto> resList = repository.findAll().stream()
                .map(customer -> CustomerShowDto.builder()
                        .name(customer.getName())  // Customer에서 name 추출
                        .email(customer.getEmail())  // Customer에서 email 추출
                        .build())  // CustomerShowDto 객체 생성
                .collect(Collectors.toList());  // 리스트로 변환

        return resList;
    }
}
