package com.program.shop_clothes.infrastructure.use_case_impl.category;

import com.program.shop_clothes.domain.Category;
import com.program.shop_clothes.infrastructure.mapper.CategoryMapper;
import com.program.shop_clothes.infrastructure.repository.CategoryEntityRepository;
import com.program.shop_clothes.use_case.category.GetCategoryByAliasUseCase;
import com.program.shop_clothes.use_case.category.GetCategoryByIdUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class GetCategoryUseByIdCaseImpl implements GetCategoryByIdUseCase {


    private final CategoryEntityRepository categoryEntityRepository;

    @Override
    public Category execute(String idCategory) {

        return CategoryMapper.INSTANCE.entityToDomain(categoryEntityRepository.findById(idCategory).orElseThrow());

    }

}
