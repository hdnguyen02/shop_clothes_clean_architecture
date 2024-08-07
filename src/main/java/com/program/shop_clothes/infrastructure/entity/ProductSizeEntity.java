package com.program.shop_clothes.infrastructure.entity;

import com.program.shop_clothes.infrastructure.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "t_products_sizes")
@Entity
@Getter
@Setter
public class ProductSizeEntity extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "id_product", nullable = false)
    private ProductEntity product;

    @ManyToOne
    @JoinColumn(name = "id_size", nullable = false)
    private SizeEntity size;

    @Column(nullable = false)
    private int quantityProduct;

}
