package com.program.shop_clothes.infrastructure.repository;

import com.program.shop_clothes.infrastructure.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryEntityRepository extends JpaRepository<CategoryEntity, String> {

    Optional<CategoryEntity> findByAlias(String alias);

}
