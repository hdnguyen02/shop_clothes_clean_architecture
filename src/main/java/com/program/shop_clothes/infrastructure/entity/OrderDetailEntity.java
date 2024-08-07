package com.program.shop_clothes.infrastructure.entity;

import com.program.shop_clothes.domain.Order;
import com.program.shop_clothes.domain.ProductSize;
import com.program.shop_clothes.domain.User;
import com.program.shop_clothes.infrastructure.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;


@Table(name = "t_orders_details")
@Entity
@Getter
@Setter
public class OrderDetailEntity extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "id_order", nullable = false)
    private OrderEntity anOrder;

    @ManyToOne
    @JoinColumn(name = "id_product_size", nullable = false)
    private ProductSizeEntity productSize;

    @Column(nullable = false)
    private int quantityProduct;


}
