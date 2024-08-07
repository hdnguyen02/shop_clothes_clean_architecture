package com.program.shop_clothes.infrastructure.entity;

import com.program.shop_clothes.infrastructure.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "t_cart_items")
@Entity
@Getter
@Setter
public class CartItemEntity extends BaseEntity {


    @Column(nullable = false)
    private int quantityProduct;

    @ManyToOne
    @JoinColumn(name = "id_product_size", nullable = false)
    private ProductSizeEntity productSize;

    @ManyToOne
    @JoinColumn(name = "username_user", nullable = false)
    private UserEntity user;

}
