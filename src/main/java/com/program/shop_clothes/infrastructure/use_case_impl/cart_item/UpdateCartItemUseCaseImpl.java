package com.program.shop_clothes.infrastructure.use_case_impl.cart_item;

import com.program.shop_clothes.domain.CartItem;
import com.program.shop_clothes.infrastructure.entity.CartItemEntity;
import com.program.shop_clothes.infrastructure.exception.ResourceNotFoundException;
import com.program.shop_clothes.infrastructure.mapper.CartItemMapper;
import com.program.shop_clothes.infrastructure.repository.CartItemEntityRepository;
import com.program.shop_clothes.use_case.cart_item.UpdateCartItemUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class UpdateCartItemUseCaseImpl implements UpdateCartItemUseCase {

    private final CartItemEntityRepository cartItemEntityRepository;

    @Override
    public CartItem execute(String idCardItem, int quantityProduct) {

        CartItemEntity cartItemEntity = cartItemEntityRepository.findById(idCardItem)
                .orElseThrow(() -> new ResourceNotFoundException(idCardItem));
        cartItemEntity.setQuantityProduct(quantityProduct);

        CartItemEntity cartItemEntityStored = cartItemEntityRepository.save(cartItemEntity);

        return CartItemMapper.INSTANCE.entityToDomain(cartItemEntityStored);

    }
}
