package com.program.shop_clothes.infrastructure.entity;

import com.program.shop_clothes.domain.Order;
import com.program.shop_clothes.domain.OrderStatus;
import com.program.shop_clothes.infrastructure.entity.base.BaseEntityAudit;
import jakarta.persistence.*;
import lombok.*;


@Table(name = "t_order_status_histories")
@Entity
@Getter
@Setter
public class OrderStatusHistoryEntity extends BaseEntityAudit {

    @ManyToOne
    @JoinColumn(name = "id_order")
    private OrderEntity anOrder;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

}
