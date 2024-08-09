package com.program.shop_clothes.infrastructure.use_case_impl.product;

import com.program.shop_clothes.domain.Product;
import com.program.shop_clothes.infrastructure.repository.ProductEntityRepository;
import com.program.shop_clothes.use_case.product.DeleteProductUseCase;
import com.program.shop_clothes.use_case.product.GetProductByIdUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DeleteProductUseCaseImpl implements DeleteProductUseCase {


    private final ProductEntityRepository productEntityRepository;
    private final GetProductByIdUseCase getProductByIdUseCase;

    @Override
    public Product execute(String idProduct) {

        Product product = getProductByIdUseCase.execute(idProduct);
        productEntityRepository.deleteById(product.getId());
        return product;

    }
}
