package com.program.shop_clothes.infrastructure.entity;

import com.program.shop_clothes.infrastructure.entity.base.BaseEntityAudit;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Table(name = "t_orders")
@Entity
@Getter
@Setter
public class OrderEntity extends BaseEntityAudit {

    @OneToMany(mappedBy = "anOrder")
    private List<OrderDetailEntity> orderDetails;

    @ManyToOne
    @JoinColumn(name = "username_user", nullable = false)
    private UserEntity user;

    @Column(nullable = false)
    private String address;

    @Column(length = 50, nullable = false)
    private String email;

    @Column(length = 50,nullable = false)
    private String phone;

    @OneToMany(mappedBy = "anOrder")
    private List<InvoiceEntity> invoices;

    @OneToMany(mappedBy = "anOrder")
    private List<OrderStatusHistoryEntity> orderStatusHistories;
}
