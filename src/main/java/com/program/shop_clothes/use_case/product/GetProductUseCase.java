package com.program.shop_clothes.use_case.product;

import com.program.shop_clothes.domain.Product;

public interface GetProductUseCase {
    Product execute(String idProduct);
}
