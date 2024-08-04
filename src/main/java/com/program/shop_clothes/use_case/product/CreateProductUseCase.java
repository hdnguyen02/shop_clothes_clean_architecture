package com.program.shop_clothes.use_case.product;

import com.program.shop_clothes.domain.Product;

import java.math.BigDecimal;

public interface CreateProductUseCase {
    Product execute(String name, String alias, BigDecimal price, String description);
}
