package com.program.shop_clothes.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class OrderDetail {

    private String id;
    private Order order;
    private ProductSize productSize;
    private int quantityProduct;
    private User user;
}
