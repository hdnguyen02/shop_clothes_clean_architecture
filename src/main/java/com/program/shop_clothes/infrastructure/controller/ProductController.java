package com.program.shop_clothes.infrastructure.controller;


import com.program.shop_clothes.infrastructure.exception.ResourceNotFoundException;
import com.program.shop_clothes.infrastructure.presenter.CommonResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;

@RequestMapping("api/v1")
public interface ProductController {

    @PostMapping("/products")
    ResponseEntity<CommonResponse> createProduct(String name, String alias, BigDecimal price,
                                                 String description, String idCategory,
                                                 MultipartFile [] files);

    @GetMapping("/products/{alias}")
    ResponseEntity<CommonResponse> getProduct(String alias) throws ResourceNotFoundException;

    @GetMapping("/products")
    ResponseEntity<CommonResponse> getAllProduct() throws ResourceNotFoundException;

    @DeleteMapping("products/{idProduct}")
    ResponseEntity<CommonResponse> deleteProduct(String idProduct);

}
