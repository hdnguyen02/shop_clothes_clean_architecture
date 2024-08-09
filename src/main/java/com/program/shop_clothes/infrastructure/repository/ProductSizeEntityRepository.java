package com.program.shop_clothes.infrastructure.repository;

import com.program.shop_clothes.infrastructure.entity.ProductSizeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductSizeEntityRepository extends JpaRepository<ProductSizeEntity, String> {
}
