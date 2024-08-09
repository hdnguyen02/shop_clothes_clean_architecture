package com.program.shop_clothes.infrastructure.mapper;

import com.program.shop_clothes.domain.Category;
import com.program.shop_clothes.infrastructure.entity.CategoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    Category entityToDomain(CategoryEntity categoryEntity);

}
