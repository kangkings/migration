package org.example.oracle.order.model.response;

import lombok.Builder;
import lombok.Getter;

import java.sql.Date;

@Builder
@Getter
public class OrderReadRes {

    private Long idx;
    private Date orderDate;
    private Integer totalAmount;
    private Long customerId;
}
