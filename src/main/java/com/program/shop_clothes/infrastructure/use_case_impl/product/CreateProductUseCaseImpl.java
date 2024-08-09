package com.program.shop_clothes.infrastructure.use_case_impl.product;

import com.program.shop_clothes.domain.Category;
import com.program.shop_clothes.domain.Product;
import com.program.shop_clothes.domain.Size;
import com.program.shop_clothes.infrastructure.entity.CategoryEntity;
import com.program.shop_clothes.infrastructure.entity.ProductEntity;
import com.program.shop_clothes.infrastructure.entity.ProductSizeEntity;
import com.program.shop_clothes.infrastructure.entity.SizeEntity;
import com.program.shop_clothes.infrastructure.mapper.ProductMapper;
import com.program.shop_clothes.infrastructure.repository.ProductEntityRepository;
import com.program.shop_clothes.infrastructure.repository.ProductSizeEntityRepository;
import com.program.shop_clothes.use_case.category.GetCategoryByIdUseCase;
import com.program.shop_clothes.use_case.product.CreateProductUseCase;
import com.program.shop_clothes.use_case.size.GetAllSizeUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;


@Component
@RequiredArgsConstructor
public class CreateProductUseCaseImpl implements CreateProductUseCase {

    private final ProductEntityRepository productEntityRepository;
    private final GetAllSizeUseCase getAllSizeUseCase;
    private final ProductSizeEntityRepository productSizeEntityRepository;
    private final GetCategoryByIdUseCase getCategoryByIdUseCase;

    @Override
    public Product execute(String name, String alias, BigDecimal price, String description, String idCategory) {

        ProductEntity productEntity = new ProductEntity();
        productEntity.setName(name);
        productEntity.setAlias(alias);
        productEntity.setPrice(price);
        productEntity.setDescription(description);
        productEntity.setCategory(new CategoryEntity(idCategory));
        productEntity.setCreatedBy("hdnguyen7702"); // username

        List<Size> sizes = getAllSizeUseCase.execute();
        Category category = getCategoryByIdUseCase.execute(idCategory);

        ProductEntity productEntityStored;

        try {
            productEntityStored = productEntityRepository.save(productEntity);
            sizes.forEach(size -> {
                ProductSizeEntity productSizeEntity = new ProductSizeEntity();
                productSizeEntity.setProduct(productEntityStored);
                productSizeEntity.setSize(new SizeEntity(size.getId()));
                productSizeEntity.setQuantityProduct(0);
                productSizeEntityRepository.save(productSizeEntity);
            });
        }
        catch (Exception ex) {
            throw new RuntimeException(ex.getMessage());
        }

        Product product = ProductMapper.INSTANCE.entityToDomain(productEntityStored);
        product.setCategory(category);

        return product;

    }
}
