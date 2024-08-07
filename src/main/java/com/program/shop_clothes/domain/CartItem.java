package com.program.shop_clothes.domain;


import com.program.shop_clothes.domain.base.BaseDomain;
import lombok.*;

@Getter
@Setter
public class CartItem extends BaseDomain {

    private int quantityProduct;
    private ProductSize productSize;
    private User user;

}
