package com.program.shop_clothes.infrastructure.repository;

import com.program.shop_clothes.infrastructure.entity.CartItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartItemEntityRepository extends JpaRepository<CartItemEntity, String> {

    List<CartItemEntity> findByUsernameUser(String usernameUser);

}
