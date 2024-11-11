package org.example.oracle.product.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ProductRegDto {

    private String name;
    private Integer price;
    private Integer stockQuantity;

}
