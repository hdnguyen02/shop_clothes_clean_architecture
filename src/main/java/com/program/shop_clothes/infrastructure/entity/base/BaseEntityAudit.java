package com.program.shop_clothes.infrastructure.entity.base;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;


@MappedSuperclass
@Getter
@Setter
@ToString
public abstract class BaseEntityAudit extends BaseEntity implements Serializable {

    @Column(updatable = false)
    private String createdBy;

    @Column(updatable = false)
    private LocalDateTime createdAt;

    private String updatedBy;
    private LocalDateTime updatedAt;


    @Override
    @PrePersist
    void onPrePersist() {
        super.onPrePersist();
        this.createdAt = LocalDateTime.now();
    }

    @PreUpdate
    void onPreUpdate() {
        this.updatedAt = LocalDateTime.now();
    }

}
