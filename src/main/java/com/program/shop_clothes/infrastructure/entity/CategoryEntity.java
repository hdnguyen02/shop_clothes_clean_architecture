package com.program.shop_clothes.infrastructure.entity;

import com.program.shop_clothes.infrastructure.entity.base.BaseEntityAudit;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Table(name = "t_categories")
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class CategoryEntity extends BaseEntityAudit {

    @Column(nullable = false, unique = true)
    private String alias;

    @Column(nullable = false, unique = true)
    private String name;

    @Column( nullable = false)
    private String description;

    @OneToMany(mappedBy = "category")
    private List<ProductEntity> products;

    public CategoryEntity(String id) {
        this.setId(id);
    }

}
