package com.program.shop_clothes.infrastructure.use_case_impl.category;

import com.program.shop_clothes.domain.Category;
import com.program.shop_clothes.infrastructure.mapper.CategoryMapper;
import com.program.shop_clothes.infrastructure.repository.CategoryEntityRepository;
import com.program.shop_clothes.use_case.category.GetCategoryByAliasUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GetCategoryByAliasUseCaseImpl implements GetCategoryByAliasUseCase {

    private final CategoryEntityRepository categoryEntityRepository;

    @Override
    public Category execute(String alias) {
        return CategoryMapper.INSTANCE.entityToDomain(categoryEntityRepository.findByAlias(alias).orElseThrow());
    }
}
