package com.program.shop_clothes.infrastructure.repository;

import com.program.shop_clothes.infrastructure.entity.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageEntityRepository extends JpaRepository<ImageEntity, String> {
}
