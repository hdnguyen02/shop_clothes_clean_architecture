package com.program.shop_clothes.infrastructure.controller.impl;

import com.program.shop_clothes.domain.CartItem;
import com.program.shop_clothes.infrastructure.controller.CartItemController;
import com.program.shop_clothes.infrastructure.presenter.CommonResponse;
import com.program.shop_clothes.infrastructure.request.CartItemRequest;
import com.program.shop_clothes.use_case.cart_item.CreateCartItemUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class CartItemControllerImpl implements CartItemController {

    private final CreateCartItemUseCase createCartItemUseCase;

    @Override
    public ResponseEntity<CommonResponse> createCartItem(CartItemRequest cartItemRequest) {

        CartItem cartItem = createCartItemUseCase.execute(cartItemRequest.getIdProductSize(),
                cartItemRequest.getQuantityProduct(), cartItemRequest.getUsernameUser());

        CommonResponse commonResponse = CommonResponse.builder()
                .status(HttpStatus.CREATED.value())
                .message("Created success")
                .data(cartItem)
                .build();

        return ResponseEntity.ok(commonResponse);

    }

    @Override
    public ResponseEntity<CommonResponse> getAllCartItem(String usernameUser) {
        return null;
    }

    @Override
    public ResponseEntity<CommonResponse> updateCartItem(String idCartItem, int quantityProduct) {
        return null;
    }

    @Override
    public ResponseEntity<CommonResponse> deleteCartItem(String idCartItem) {
        return null;
    }
}
