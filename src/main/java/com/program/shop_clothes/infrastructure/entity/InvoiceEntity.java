package com.program.shop_clothes.infrastructure.entity;

import com.program.shop_clothes.domain.InvoiceStatus;
import com.program.shop_clothes.domain.PaymentMethod;
import com.program.shop_clothes.infrastructure.entity.base.BaseEntityAudit;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Table(name = "t_invoices")
@Entity
@Getter
@Setter
public class InvoiceEntity extends BaseEntityAudit {

    @ManyToOne
    @JoinColumn(name = "id_order", nullable = false)
    private OrderEntity anOrder;

    @Column(nullable = false)
    private BigDecimal amount;


    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;


    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private InvoiceStatus invoiceStatus;

}
