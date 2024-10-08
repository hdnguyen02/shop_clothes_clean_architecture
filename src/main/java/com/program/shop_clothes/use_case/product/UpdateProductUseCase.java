package com.program.shop_clothes.use_case.product;

import com.program.shop_clothes.domain.Product;
import com.program.shop_clothes.infrastructure.exception.ResourceNotFoundException;

import java.math.BigDecimal;

public interface UpdateProductUseCase {
    Product execute(String idProduct, String name, String alias, BigDecimal price, String description) throws ResourceNotFoundException;
}
