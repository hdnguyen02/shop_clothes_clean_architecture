package com.program.shop_clothes.domain;

import com.program.shop_clothes.domain.base.BaseDomain;
import lombok.*;

@Getter
@Setter
public class ProductSize extends BaseDomain {

    private Product product;
    private Size size;
    private int quantityProduct;

}
