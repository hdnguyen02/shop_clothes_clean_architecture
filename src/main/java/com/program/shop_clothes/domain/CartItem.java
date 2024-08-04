package com.program.shop_clothes.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class CartItem {

    private String id;
    private int quantityProduct;
    private ProductSize productSize;
    private User user;

}
