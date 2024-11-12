package org.example.oracle.order.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.sql.Date;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class OrderRegisterReq {

    private Long customerId;
    private Date orderDate;
    private List<Long> productList;

}
