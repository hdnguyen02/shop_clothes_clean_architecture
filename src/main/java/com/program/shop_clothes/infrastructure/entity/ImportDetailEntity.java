package com.program.shop_clothes.infrastructure.entity;

import com.program.shop_clothes.infrastructure.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "t_imports_details")
@Entity
@Getter
@Setter
public class ImportDetailEntity extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "id_import", nullable = false)
    private ImportEntity anImport;

    @ManyToOne
    @JoinColumn(name = "id_product_size", nullable = false)
    private ProductSizeEntity productSize;

    @Column(nullable = false)
    private int quantityProduct;

}
