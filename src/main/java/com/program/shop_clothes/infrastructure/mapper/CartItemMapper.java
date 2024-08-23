package com.program.shop_clothes.infrastructure.mapper;

import com.program.shop_clothes.domain.CartItem;
import com.program.shop_clothes.infrastructure.entity.CartItemEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CartItemMapper {

    CartItemMapper INSTANCE = Mappers.getMapper(CartItemMapper.class);

    CartItem entityToDomain(CartItemEntity cartItemEntity);

}