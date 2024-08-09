package com.program.shop_clothes.infrastructure.use_case_impl.product;

import com.program.shop_clothes.domain.Product;
import com.program.shop_clothes.infrastructure.entity.ProductEntity;
import com.program.shop_clothes.infrastructure.exception.ResourceNotFoundException;
import com.program.shop_clothes.infrastructure.mapper.ProductMapper;
import com.program.shop_clothes.infrastructure.repository.ProductEntityRepository;
import com.program.shop_clothes.use_case.product.GetProductByAliasUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GetProductByAliasUseCaseImpl implements GetProductByAliasUseCase {


    private final ProductEntityRepository productEntityRepository;

    @Override
    public Product execute(String alias) throws ResourceNotFoundException {

        ProductEntity productEntity = productEntityRepository.findByAlias(alias)
                .orElseThrow(() -> new ResourceNotFoundException("Not found product with alias: " + alias));

        return ProductMapper.INSTANCE.entityToDomain(productEntity);
    }
}
