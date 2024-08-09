package com.program.shop_clothes.infrastructure.use_case_impl.product;

import com.program.shop_clothes.domain.Product;
import com.program.shop_clothes.infrastructure.entity.ProductEntity;
import com.program.shop_clothes.infrastructure.exception.ResourceNotFoundException;
import com.program.shop_clothes.infrastructure.mapper.ProductMapper;
import com.program.shop_clothes.infrastructure.repository.ProductEntityRepository;
import com.program.shop_clothes.use_case.product.UpdateProductUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Component
@RequiredArgsConstructor
public class UpdateProductUseCaseImpl implements UpdateProductUseCase {

    private final ProductEntityRepository productEntityRepository;

    @Override
    public Product execute(String idProduct, String name, String alias, BigDecimal price, String description) throws ResourceNotFoundException {

        ProductEntity productEntity = productEntityRepository.findById(idProduct)
                .orElseThrow( () -> new ResourceNotFoundException("Not found product with id: " + idProduct));


        productEntity.setUpdatedAt(LocalDateTime.now());
        productEntity.setName(name);
        productEntity.setAlias(alias);
        productEntity.setPrice(price);
        productEntity.setDescription(description);

        ProductEntity productEntityStored = productEntityRepository.save(productEntity);

        return ProductMapper.INSTANCE.entityToDomain(productEntityStored);

    }
}
