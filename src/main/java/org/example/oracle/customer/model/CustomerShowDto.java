package org.example.oracle.customer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerShowDto {
    private String name;
    private String email;
    private Timestamp createdAt;
}
