package com.program.shop_clothes.use_case.category;

import com.program.shop_clothes.domain.Category;

public interface DeleteCategoryUseCase {

    Category execute(String id);

}
