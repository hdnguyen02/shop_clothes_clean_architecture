package com.program.shop_clothes.infrastructure.use_case_impl.cart_item;


import com.program.shop_clothes.domain.CartItem;
import com.program.shop_clothes.infrastructure.mapper.CartItemMapper;
import com.program.shop_clothes.infrastructure.repository.CartItemEntityRepository;
import com.program.shop_clothes.use_case.cart_item.GetAllCartItemByUsernameUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class GetAllCartItemByUsernameUserUseCaseImpl implements GetAllCartItemByUsernameUserUseCase {

    private final CartItemEntityRepository cartItemEntityRepository;

    @Override
    public List<CartItem> execute(String usernameUser) {

        return cartItemEntityRepository.findByUsernameUser(usernameUser).stream()
                .map(CartItemMapper.INSTANCE::entityToDomain).toList();
    }
}
