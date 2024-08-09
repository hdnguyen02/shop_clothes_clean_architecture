package com.program.shop_clothes.infrastructure.controller;


import com.program.shop_clothes.infrastructure.presenter.CommonResponse;
import com.program.shop_clothes.infrastructure.request.CategoryRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("api/v1")
public interface CategoryController {


    @PostMapping("/categories")
    ResponseEntity<CommonResponse> createCategory(CategoryRequest categoryRequest);

    @GetMapping("/categories")
    ResponseEntity<CommonResponse> getAllCategory();

    @PutMapping("categories/{idCategory}")
    ResponseEntity<CommonResponse> updateCategory(String idCategory, CategoryRequest categoryRequest);

}
