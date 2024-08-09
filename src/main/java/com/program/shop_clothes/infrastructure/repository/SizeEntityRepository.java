package com.program.shop_clothes.infrastructure.repository;

import com.program.shop_clothes.infrastructure.entity.SizeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SizeEntityRepository extends JpaRepository<SizeEntity, String> {
}
