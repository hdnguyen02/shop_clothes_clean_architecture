package com.program.shop_clothes.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class Product {
    private String id;
    private String alias;
    private String name;
    private String description;
    private BigDecimal price;
    private List<Size> sizes;
    private List<Category> categories;
    private List<Image> images;
    private boolean isEnabled;
}
