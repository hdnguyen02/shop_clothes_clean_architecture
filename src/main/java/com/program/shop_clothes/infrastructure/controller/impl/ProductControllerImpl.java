package com.program.shop_clothes.infrastructure.controller.impl;


import com.program.shop_clothes.domain.Image;
import com.program.shop_clothes.domain.Product;
import com.program.shop_clothes.infrastructure.controller.ProductController;
import com.program.shop_clothes.infrastructure.exception.ResourceNotFoundException;
import com.program.shop_clothes.infrastructure.presenter.CommonResponse;
import com.program.shop_clothes.use_case.image.CreateImageUseCase;
import com.program.shop_clothes.use_case.product.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

// 4 mức độ cô lập:
// READ_UNCOMMIT: => đọc dữ liệu khi mà transaction khác chưa commit
// READ_COMMIT => đọc dữ liệu đã được commit -> nếu giá trị sau đó được commit bởi trans khác thì
// xảy ra tình trạng non-repeatable reads
// REPEATABLE READ => khóa lại khi đọc dữ liệu -> không xảy ra tình trạng non-repeatable reads nhưng không ngăn
// ngăn được dữ liệu ma
// SERIALIZABLE => ngăn chặn được dữ liệu ma => không được thêm vào khi trans đang đọc dữ liệu

// Trong spring boot có cơ chế quản trans, và việc đánh annotation lên class hay method
// dẫn đến sự khác nhau trong mã lệnh
// => Trans trên class => hỗ trợ tốt khi các method trong class đó được gọi từ bên ngoài class
// => Trans trên method => không hỗ trợ khi các method trong class gọi nội bộ lẫn nhau
// Trans trong spring boot được kích hoạt mặt định nếu sử dụng spring-data-[]
// Với RuntimeException => mặt định rollback

@RestController
@RequiredArgsConstructor
public class ProductControllerImpl implements ProductController {

    private final CreateProductUseCase createProductUseCase;
    private final CreateImageUseCase createImageUseCase;
    private final GetProductByAliasUseCase getProductByAliasUseCase;
    private final GetAllProductUseCase getAllProductUseCase;
    private final DeleteProductUseCase deleteProductUseCase;



    @Override
    @Transactional
    public ResponseEntity<CommonResponse> createProduct(@RequestParam String name,
                                                        @RequestParam String alias,
                                                        @RequestParam BigDecimal price,
                                                        @RequestParam String description,
                                                        @RequestParam String idCategory,
                                                        @RequestParam MultipartFile [] files) {

        Product product = createProductUseCase.execute(name, alias, price, description, idCategory);
        List<Image> images = createImageUseCase.execute(files, product.getId());
        product.setImages(images);

        CommonResponse commonResponse = CommonResponse.builder()
                .status(HttpStatus.CREATED.value())
                .message("Created success")
                .data(product)
                .build();

        return ResponseEntity.ok(commonResponse);
    }

    @Override
    public ResponseEntity<CommonResponse> getProduct(@PathVariable String alias) throws ResourceNotFoundException {

        Product product = getProductByAliasUseCase.execute(alias);

        CommonResponse commonResponse = CommonResponse.builder()
                .status(HttpStatus.OK.value())
                .message("Query success")
                .data(product)
                .build();

        return ResponseEntity.ok(commonResponse);
    }

    @Override
    public ResponseEntity<CommonResponse> getAllProduct() throws ResourceNotFoundException {

        List<Product> products = getAllProductUseCase.execute();

        CommonResponse commonResponse = CommonResponse.builder()
                .message("Query success")
                .status(HttpStatus.OK.value())
                .data(products)
                .build();

        return ResponseEntity.ok(commonResponse);

    }

    @Override
    public ResponseEntity<CommonResponse> deleteProduct(@PathVariable String idProduct) {

        Product product = deleteProductUseCase.execute(idProduct);

        CommonResponse commonResponse = CommonResponse.builder()
                .status(HttpStatus.OK.value())
                .message("Deleted success")
                .data(product)
                .build();

        return ResponseEntity.ok(commonResponse);
    }
}
