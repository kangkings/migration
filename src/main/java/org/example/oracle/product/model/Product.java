package org.example.oracle.product.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.oracle.order.model.Order;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "products")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idx")
    private Long idx;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "price", nullable = false, unique = true)
    private Integer price;

    @Column(name = "stock_quantity", nullable = false)
    private Integer stockQuantity;

    // 양방향 관계 설정: 제품은 하나의 주문에 속함
    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;
}
