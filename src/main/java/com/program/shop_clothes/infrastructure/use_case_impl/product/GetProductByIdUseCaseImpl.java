package com.program.shop_clothes.infrastructure.use_case_impl.product;

import com.program.shop_clothes.domain.Product;
import com.program.shop_clothes.infrastructure.mapper.ProductMapper;
import com.program.shop_clothes.infrastructure.repository.ProductEntityRepository;
import com.program.shop_clothes.use_case.product.GetProductByIdUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class GetProductByIdUseCaseImpl implements GetProductByIdUseCase {

    private final ProductEntityRepository productEntityRepository;

    @Override
    public Product execute(String idProduct) {
        return ProductMapper.INSTANCE.entityToDomain(productEntityRepository.findById(idProduct).orElseThrow()) ;
    }
}
