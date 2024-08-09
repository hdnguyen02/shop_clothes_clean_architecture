package com.program.shop_clothes.infrastructure.use_case_impl.category;


import com.program.shop_clothes.domain.Category;
import com.program.shop_clothes.infrastructure.entity.CategoryEntity;
import com.program.shop_clothes.infrastructure.entity.ProductEntity;
import com.program.shop_clothes.infrastructure.exception.ResourceNotFoundException;
import com.program.shop_clothes.infrastructure.mapper.CategoryMapper;
import com.program.shop_clothes.infrastructure.repository.CategoryEntityRepository;
import com.program.shop_clothes.use_case.category.UpdateCategoryUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UpdateCategoryUseCaseImpl implements UpdateCategoryUseCase {


    private final CategoryEntityRepository categoryEntityRepository;

    @Override
    public Category execute(String idCategory, String name, String alias, String description, List<String> idProducts) {



        CategoryEntity categoryEntity = categoryEntityRepository.findById(idCategory)
                .orElseThrow(() -> new ResourceNotFoundException("Not found category with id: " + idCategory));

        List<ProductEntity> productEntities = idProducts.stream()
                .map(ProductEntity::new).toList();

        categoryEntity.setName(name);
        categoryEntity.setAlias(alias);
        categoryEntity.setDescription(description);
        categoryEntity.setProducts(productEntities);

        return CategoryMapper.INSTANCE.entityToDomain(categoryEntity);

    }
}
