package com.program.shop_clothes.infrastructure.mapper;

import com.program.shop_clothes.domain.Import;
import com.program.shop_clothes.infrastructure.entity.ImportEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ImportMapper {

    ImportMapper INSTANCE = Mappers.getMapper(ImportMapper.class);


    Import entityToDomain(ImportEntity importEntity);

}
