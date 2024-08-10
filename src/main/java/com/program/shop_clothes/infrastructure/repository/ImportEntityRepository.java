package com.program.shop_clothes.infrastructure.repository;

import com.program.shop_clothes.infrastructure.entity.ImportEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImportEntityRepository extends JpaRepository<ImportEntity, String> {
}
