package com.program.shop_clothes.use_case.product;

import com.program.shop_clothes.domain.Product;

public interface DeleteProductUseCase {
    Product execute(String id);
}
