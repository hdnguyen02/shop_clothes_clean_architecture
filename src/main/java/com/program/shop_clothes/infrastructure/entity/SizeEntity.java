package com.program.shop_clothes.infrastructure.entity;

import com.program.shop_clothes.infrastructure.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Table(name = "t_sizes")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class SizeEntity extends BaseEntity {

    @Column(length = 10, nullable = false, updatable = false, unique = true)
    private String name;

    public SizeEntity(String id) {
        this.setId(id);
    }
}
