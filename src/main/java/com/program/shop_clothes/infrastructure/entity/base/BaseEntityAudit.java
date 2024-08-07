package com.program.shop_clothes.infrastructure.entity.base;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PreUpdate;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;


@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntityAudit extends BaseEntity implements Serializable {


    @Column(updatable = false)
    private String createdBy;

    @Column(updatable = false)
    private LocalDate createdAt;

    private String updatedBy;
    private LocalDate updatedAt;

    @Override
    void onPrePersist() {
        super.onPrePersist();
        this.createdAt = LocalDate.now();
    }

    @PreUpdate
    void onPreUpdate() {
        this.updatedAt = LocalDate.now();
    }

}
