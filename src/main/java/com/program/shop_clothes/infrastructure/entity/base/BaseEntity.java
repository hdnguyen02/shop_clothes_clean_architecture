package com.program.shop_clothes.infrastructure.entity.base;


import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity implements Serializable {

    @Id
    @Column(updatable = false)
    private String id;

    @PrePersist
    void onPrePersist() {
        this.id = UUID.randomUUID().toString();
    }

}
