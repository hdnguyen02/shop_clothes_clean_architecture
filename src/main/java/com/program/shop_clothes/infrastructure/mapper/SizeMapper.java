package com.program.shop_clothes.infrastructure.mapper;


import com.program.shop_clothes.domain.Size;
import com.program.shop_clothes.infrastructure.entity.SizeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SizeMapper {
    SizeMapper INSTANCE = Mappers.getMapper(SizeMapper.class);
    Size entityToDomain(SizeEntity sizeEntity);
}
