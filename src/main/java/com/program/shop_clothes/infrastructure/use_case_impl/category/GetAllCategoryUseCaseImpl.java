package com.program.shop_clothes.infrastructure.use_case_impl.category;

import com.program.shop_clothes.domain.Category;
import com.program.shop_clothes.infrastructure.mapper.CategoryMapper;
import com.program.shop_clothes.infrastructure.repository.CategoryEntityRepository;
import com.program.shop_clothes.use_case.category.GetAllCategoryUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class GetAllCategoryUseCaseImpl implements GetAllCategoryUseCase {

    private final CategoryEntityRepository categoryEntityRepository;

    @Override
    public List<Category> execute() {
        return categoryEntityRepository.findAll().stream().map(CategoryMapper.INSTANCE::entityToDomain).toList();
    }
}
