package com.program.shop_clothes.infrastructure.entity;

import com.program.shop_clothes.infrastructure.entity.base.BaseEntityAudit;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Table(name = "t_categories")
@Entity
@Getter
@Setter
public class CategoryEntity extends BaseEntityAudit {

    @Column(nullable = false, unique = true)
    private String alias;

    @Column(nullable = false, unique = true)
    private String name;

    @Column( nullable = false)
    private String description;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable( name = "t_products_categories", joinColumns = @JoinColumn(name = "id_category"),inverseJoinColumns = @JoinColumn(name = "id_product"))
    private List<ProductEntity> products;

}
