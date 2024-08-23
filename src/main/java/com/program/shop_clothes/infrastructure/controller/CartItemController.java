package com.program.shop_clothes.infrastructure.controller;


import com.program.shop_clothes.infrastructure.presenter.CommonResponse;
import com.program.shop_clothes.infrastructure.request.CartItemRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1")
public interface CartItemController {

    @PostMapping("/cart-items")
    ResponseEntity<CommonResponse> createCartItem(@RequestBody CartItemRequest cartItemRequest);

    @GetMapping("/cart-items/${usernameUser}")
    ResponseEntity<CommonResponse> getAllCartItem(@PathVariable String usernameUser);

    @PutMapping("cart-items/${usernameUser}")
    ResponseEntity<CommonResponse> updateCartItem(@PathVariable String usernameUser,
                                                  @RequestParam int quantityProduct);

    @DeleteMapping("/cart-items/${idCartItem}")
    ResponseEntity<CommonResponse> deleteCartItem(@PathVariable String idCartItem);

}
