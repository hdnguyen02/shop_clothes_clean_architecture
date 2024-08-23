package com.program.shop_clothes.infrastructure.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CartItemRequest {

    private String idProductSize;
    private int quantityProduct;
    private String usernameUser;
}
