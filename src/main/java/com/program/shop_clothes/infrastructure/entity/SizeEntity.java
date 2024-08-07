package com.program.shop_clothes.infrastructure.entity;

import com.program.shop_clothes.infrastructure.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Table(name = "t_sizes")
@Entity
@Getter
@Setter
public class SizeEntity extends BaseEntity {


    @Column(length = 10, nullable = false)
    private String name;

    @ManyToMany
    @JoinTable(name = "t_products_sizes", joinColumns = @JoinColumn(name = "id_size"), inverseJoinColumns = @JoinColumn(name = "id_product"))
    private List<ProductEntity> products;
}
