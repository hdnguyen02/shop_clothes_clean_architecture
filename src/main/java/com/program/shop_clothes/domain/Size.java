package com.program.shop_clothes.domain;

import com.program.shop_clothes.domain.base.BaseDomain;
import lombok.*;

import java.util.List;

@Getter
@Setter
public class Size extends BaseDomain {

    private String name;
    private List<Product> products;
}
