package com.program.shop_clothes.infrastructure.entity;

import com.program.shop_clothes.infrastructure.entity.base.BaseEntityAudit;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "t_reviews")
@Entity
@Getter
@Setter
public class ReviewEntity extends BaseEntityAudit {

    @ManyToOne
    @JoinColumn(name = "username_user")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "id_product")
    private ProductEntity product;
    private String content;
    private int star;

}
