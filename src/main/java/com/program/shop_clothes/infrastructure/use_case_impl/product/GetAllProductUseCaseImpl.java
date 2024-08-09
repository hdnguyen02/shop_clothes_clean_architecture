package com.program.shop_clothes.infrastructure.use_case_impl.product;

import com.program.shop_clothes.domain.Product;
import com.program.shop_clothes.infrastructure.entity.ProductEntity;
import com.program.shop_clothes.infrastructure.mapper.ProductMapper;
import com.program.shop_clothes.infrastructure.repository.ProductEntityRepository;
import com.program.shop_clothes.use_case.product.GetAllProductUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@RequiredArgsConstructor
public class GetAllProductUseCaseImpl implements GetAllProductUseCase {

    private final ProductEntityRepository productEntityRepository;

    @Override
    public List<Product> execute() {

        List<ProductEntity> productEntities = productEntityRepository.findAll();

        return productEntities.stream()
                .map(ProductMapper.INSTANCE::entityToDomain).toList();
    }
}
