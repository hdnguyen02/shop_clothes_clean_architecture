package com.program.shop_clothes.domain;

import com.program.shop_clothes.domain.base.BaseDomainAudit;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
public class Invoice extends BaseDomainAudit {

    private Order order;
    private BigDecimal amount;
    private PaymentMethod paymentMethod;
    private InvoiceStatus invoiceStatus;

}
