package com.program.shop_clothes.use_case.product;

import com.program.shop_clothes.domain.Product;
import com.program.shop_clothes.infrastructure.exception.ResourceNotFoundException;

public interface GetProductByAliasUseCase {

    Product execute(String alias) throws ResourceNotFoundException;

}
