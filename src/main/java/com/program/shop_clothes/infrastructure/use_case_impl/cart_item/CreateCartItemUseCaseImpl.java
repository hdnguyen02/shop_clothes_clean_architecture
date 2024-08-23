package com.program.shop_clothes.infrastructure.use_case_impl.cart_item;

import com.program.shop_clothes.domain.CartItem;
import com.program.shop_clothes.infrastructure.entity.CartItemEntity;
import com.program.shop_clothes.infrastructure.entity.ProductSizeEntity;
import com.program.shop_clothes.infrastructure.entity.UserEntity;
import com.program.shop_clothes.infrastructure.exception.ResourceNotFoundException;
import com.program.shop_clothes.infrastructure.mapper.CartItemMapper;
import com.program.shop_clothes.infrastructure.repository.CartItemEntityRepository;
import com.program.shop_clothes.infrastructure.repository.ProductSizeEntityRepository;
import com.program.shop_clothes.infrastructure.repository.UserEntityRepository;
import com.program.shop_clothes.use_case.cart_item.CreateCartItemUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class CreateCartItemUseCaseImpl implements CreateCartItemUseCase {

    private final CartItemEntityRepository cartItemEntityRepository;
    private final UserEntityRepository userEntityRepository;
    private final ProductSizeEntityRepository productSizeEntityRepository;

    @Override
    public CartItem execute(String idProductSize, int quantityProduct, String username) {

        ProductSizeEntity productSizeEntity = productSizeEntityRepository.findById(idProductSize)
                .orElseThrow(() -> new ResourceNotFoundException("Not found ProductSize with id: " + idProductSize));
        UserEntity userEntity = userEntityRepository.findByUsername(username)
                .orElseThrow(() -> new ResourceNotFoundException("Not found User with username: " + username));
        CartItemEntity cartItemEntity = new CartItemEntity();

        cartItemEntity.setProductSize(productSizeEntity);
        cartItemEntity.setUser(userEntity);
        cartItemEntity.setQuantityProduct(quantityProduct);

        CartItemEntity cartItemEntityStored = cartItemEntityRepository.save(cartItemEntity);

        return CartItemMapper.INSTANCE.entityToDomain(cartItemEntityStored);

    }


}
