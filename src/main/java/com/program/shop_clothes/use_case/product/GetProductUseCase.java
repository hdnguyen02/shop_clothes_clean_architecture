package com.program.shop_clothes.use_case.product;

import com.program.shop_clothes.domain.Product;

import java.util.List;

public interface GetProductUseCase {
    Product execute(String id);
}
