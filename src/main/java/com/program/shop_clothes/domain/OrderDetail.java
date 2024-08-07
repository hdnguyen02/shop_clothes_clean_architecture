package com.program.shop_clothes.domain;


import com.program.shop_clothes.domain.base.BaseDomain;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OrderDetail extends BaseDomain {

    private Order order;
    private ProductSize productSize;
    private int quantityProduct;

}
