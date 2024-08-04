package com.program.shop_clothes.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class ProductSize {
    private String id;
    private Product product;
    private Size size;
    private int quantity;
}
