package com.program.shop_clothes.domain.base;

import com.program.shop_clothes.infrastructure.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public abstract class BaseDomainAudit extends BaseEntity {

    private String createdBy;
    private String updatedBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
