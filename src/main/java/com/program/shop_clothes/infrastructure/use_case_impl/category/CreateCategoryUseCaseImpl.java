package com.program.shop_clothes.infrastructure.use_case_impl.category;

import com.program.shop_clothes.domain.Category;
import com.program.shop_clothes.infrastructure.entity.CategoryEntity;
import com.program.shop_clothes.infrastructure.entity.ProductEntity;
import com.program.shop_clothes.infrastructure.mapper.CategoryMapper;
import com.program.shop_clothes.infrastructure.repository.CategoryEntityRepository;
import com.program.shop_clothes.use_case.category.CreateCategoryUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@RequiredArgsConstructor
public class CreateCategoryUseCaseImpl implements CreateCategoryUseCase {


    private final CategoryEntityRepository categoryEntityRepository;

    @Override
    public Category execute(String name, String alias, String description, List<String> idProducts) {


        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setName(name);
        categoryEntity.setAlias(alias);
        categoryEntity.setDescription(description);

        List<ProductEntity> productEntities = idProducts.stream()
                .map(ProductEntity::new).toList();

        categoryEntity.setProducts(productEntities);

        CategoryEntity categoryEntityStored = categoryEntityRepository.save(categoryEntity);

        return CategoryMapper.INSTANCE.entityToDomain(categoryEntityStored);
    }
}
