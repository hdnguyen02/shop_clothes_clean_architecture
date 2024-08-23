package com.program.shop_clothes.infrastructure.use_case_impl.cart_item;

import com.program.shop_clothes.infrastructure.repository.CartItemEntityRepository;
import com.program.shop_clothes.use_case.cart_item.DeleteCartItemUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DeleteCartItemUseCaseImpl implements DeleteCartItemUseCase {

    private final CartItemEntityRepository cartItemEntityRepository;

    @Override
    public void execute(String idCartItem) {
        cartItemEntityRepository.deleteById(idCartItem);
    }
}
