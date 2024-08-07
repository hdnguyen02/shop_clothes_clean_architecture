package com.program.shop_clothes.infrastructure.entity;

import com.program.shop_clothes.infrastructure.entity.base.BaseEntityAudit;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Table(name = "t_imports")
@Entity
@Getter
@Setter
@Builder
public class ImportEntity extends BaseEntityAudit {

    @OneToMany(mappedBy = "anImport")
    @Column(nullable = false, updatable = false)
    private List<ImportDetailEntity> importDetails;

    @Column(nullable = false, updatable = false)
    private String message;

}
