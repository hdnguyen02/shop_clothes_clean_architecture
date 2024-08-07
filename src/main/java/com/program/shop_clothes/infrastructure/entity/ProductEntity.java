package com.program.shop_clothes.infrastructure.entity;

import com.program.shop_clothes.infrastructure.entity.base.BaseEntityAudit;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;


@Table(name = "t_products")
@Entity
@Getter
@Setter
public class ProductEntity extends BaseEntityAudit {

    @Column(length = 100, nullable = false)
    private String alias;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private BigDecimal price;


    @ManyToMany
    @JoinTable(name = "t_products_sizes", joinColumns = @JoinColumn(name = "id_product"), inverseJoinColumns = @JoinColumn(name = "id_size"))
    private List<SizeEntity> sizes;


    @ManyToMany
    @JoinTable(name = "t_products_categories", joinColumns = @JoinColumn(name = "id_product"), inverseJoinColumns = @JoinColumn(name = "id_category"))
    private List<CategoryEntity> categories;

    @OneToMany(mappedBy = "product")
    private List<ReviewEntity> reviews;

    @OneToMany(mappedBy = "product")
    private List<ImageEntity> images;

    @Column(nullable = false)
    private boolean isEnabled;

}
