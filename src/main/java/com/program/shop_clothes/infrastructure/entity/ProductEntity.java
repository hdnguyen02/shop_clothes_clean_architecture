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
@NoArgsConstructor
@ToString
public class ProductEntity extends BaseEntityAudit {

    @Column(length = 100, nullable = false, unique = true)
    private String alias;

    @Column(length = 100, nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private BigDecimal price;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_category")
    private CategoryEntity category;

    @OneToMany(mappedBy = "product")
    private List<ImageEntity> images;

    @Column(nullable = false)
    private boolean isEnabled;

    public ProductEntity(String id) {
        setId(id);
    }


    @PrePersist
    public void prePersist() {
        this.isEnabled = true;
    }

}
