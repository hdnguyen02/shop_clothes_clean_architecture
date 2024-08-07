package com.program.shop_clothes.use_case.category;

import com.program.shop_clothes.domain.Category;

import java.util.List;

public interface CreateCategoryUseCase {
    Category execute(String name, String alias, String description, List<String> idProducts);
}
