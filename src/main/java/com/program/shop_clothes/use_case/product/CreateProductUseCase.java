package com.program.shop_clothes.use_case.product;

import com.program.shop_clothes.domain.Product;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.util.List;

public interface CreateProductUseCase {
    Product execute(String name, String alias, BigDecimal price, String description, List<String> idCategories, List<String> idSizes, List<MultipartFile> images);
}
