package com.program.shop_clothes.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class Category {
    private String id;
    private String alias;
    private String name;
    private String description;
    private List<Product> products;
}
