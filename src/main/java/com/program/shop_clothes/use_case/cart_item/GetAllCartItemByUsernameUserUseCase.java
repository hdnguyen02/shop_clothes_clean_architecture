package com.program.shop_clothes.use_case.cart_item;

import com.program.shop_clothes.domain.CartItem;

import java.util.List;

public interface GetAllCartItemByUsernameUserUseCase {
    List<CartItem> execute(String usernameUser);
}
