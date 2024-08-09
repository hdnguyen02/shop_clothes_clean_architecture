package com.program.shop_clothes.infrastructure.repository;

import com.program.shop_clothes.infrastructure.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductEntityRepository extends JpaRepository<ProductEntity, String> {


    Optional<ProductEntity> findByAlias(String alias);

}
