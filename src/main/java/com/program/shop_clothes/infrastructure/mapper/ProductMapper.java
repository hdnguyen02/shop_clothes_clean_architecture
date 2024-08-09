package com.program.shop_clothes.infrastructure.mapper;


import com.program.shop_clothes.domain.Product;
import com.program.shop_clothes.infrastructure.entity.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    Product entityToDomain(ProductEntity productEntity);

}
