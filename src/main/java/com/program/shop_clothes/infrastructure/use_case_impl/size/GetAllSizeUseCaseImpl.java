package com.program.shop_clothes.infrastructure.use_case_impl.size;

import com.program.shop_clothes.domain.Size;
import com.program.shop_clothes.infrastructure.entity.SizeEntity;
import com.program.shop_clothes.infrastructure.mapper.SizeMapper;
import com.program.shop_clothes.infrastructure.repository.SizeEntityRepository;
import com.program.shop_clothes.use_case.size.GetAllSizeUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@RequiredArgsConstructor
public class GetAllSizeUseCaseImpl implements GetAllSizeUseCase {


    private final SizeEntityRepository sizeEntityRepository;

    @Override
    public List<Size> execute() {

        List<SizeEntity> sizeEntities = sizeEntityRepository.findAll();
        return sizeEntities.stream().map(SizeMapper.INSTANCE::entityToDomain).toList();

    }
}
