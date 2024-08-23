package com.program.shop_clothes.infrastructure.repository;

import com.program.shop_clothes.infrastructure.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleEntityRepository extends JpaRepository<RoleEntity, String> {
}
