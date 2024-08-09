package com.program.shop_clothes.infrastructure.controller.impl;

import com.program.shop_clothes.domain.Category;
import com.program.shop_clothes.infrastructure.controller.CategoryController;
import com.program.shop_clothes.infrastructure.presenter.CommonResponse;
import com.program.shop_clothes.infrastructure.request.CategoryRequest;
import com.program.shop_clothes.use_case.category.CreateCategoryUseCase;
import com.program.shop_clothes.use_case.category.GetAllCategoryUseCase;
import com.program.shop_clothes.use_case.category.UpdateCategoryUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class CategoryControllerImpl implements CategoryController {


    private final CreateCategoryUseCase createCategoryUseCase;
    private final GetAllCategoryUseCase getAllCategoryUseCase;
    private final UpdateCategoryUseCase updateCategoryUseCase;

    @Override
    public ResponseEntity<CommonResponse> createCategory(CategoryRequest categoryRequest) {

        Category category = createCategoryUseCase.execute(
                categoryRequest.getName(), categoryRequest.getAlias(),
                categoryRequest.getDescription(), categoryRequest.getIdProducts());

        CommonResponse commonResponse = CommonResponse.builder()
                .status(HttpStatus.CREATED.value())
                .message("Created success")
                .data(category)
                .build();

        return ResponseEntity.ok(commonResponse);

    }

    @Override
    public ResponseEntity<CommonResponse> getAllCategory() {


        List<Category> categories = getAllCategoryUseCase.execute();

        CommonResponse commonResponse = CommonResponse.builder()
                .status(HttpStatus.OK.value())
                .message("Query success")
                .data(categories)
                .build();

        return ResponseEntity.ok(commonResponse);

    }

    @Override
    public ResponseEntity<CommonResponse> updateCategory(String idCategory, CategoryRequest categoryRequest) {

        Category category = updateCategoryUseCase.execute(
                idCategory, categoryRequest.getName(),
                categoryRequest.getAlias(), categoryRequest.getDescription(),
                categoryRequest.getIdProducts());

        CommonResponse commonResponse = CommonResponse.builder()
                .status(HttpStatus.OK.value())
                .message("Updated success")
                .data(category)
                .build();

        return ResponseEntity.ok(commonResponse);

    }
}
