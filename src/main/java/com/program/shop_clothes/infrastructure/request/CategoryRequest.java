package com.program.shop_clothes.infrastructure.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CategoryRequest {
    private String name;
    private String alias;
    private String description;
    private List<String> idProducts;
}
