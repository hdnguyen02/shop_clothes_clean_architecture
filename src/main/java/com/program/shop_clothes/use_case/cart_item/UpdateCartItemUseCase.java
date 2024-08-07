package com.program.shop_clothes.use_case.cart_item;

import com.program.shop_clothes.domain.CartItem;

public interface UpdateCartItemUseCase {

    CartItem execute(String idCardItem, int quantityProduct);

}
