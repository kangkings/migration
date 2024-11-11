package org.example.oracle.product.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductInfoDto {
    private Long idx;
    private String name;
    private Integer price;
    private Integer stockQuantity;
}
