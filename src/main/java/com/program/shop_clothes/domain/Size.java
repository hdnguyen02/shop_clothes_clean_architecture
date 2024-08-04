package com.program.shop_clothes.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class Size {

    private String id;
    private String name;
    private List<Product> products;
    private int quantityProduct;

}
