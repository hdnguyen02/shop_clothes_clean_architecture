package com.program.shop_clothes.use_case.cart_item;

import com.program.shop_clothes.domain.CartItem;

public interface CreateCartItemUseCase {
    CartItem execute(String idProductSize, int quantityProduct, String username);
}
