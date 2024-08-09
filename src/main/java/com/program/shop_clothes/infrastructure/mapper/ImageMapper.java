package com.program.shop_clothes.infrastructure.mapper;


import com.program.shop_clothes.domain.Image;
import com.program.shop_clothes.infrastructure.entity.ImageEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface ImageMapper {

    ImageMapper INSTANCE = Mappers.getMapper(ImageMapper.class);

    Image entityToDomain(ImageEntity imageEntity);

}
