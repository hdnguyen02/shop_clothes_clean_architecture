package com.program.shop_clothes.domain;

import com.program.shop_clothes.domain.base.BaseDomainAudit;
import lombok.*;

import java.util.List;

@Getter
@Setter
public class Order extends BaseDomainAudit {

    private List<OrderDetail> orderDetails;
    private User user;
    private String address;
    private String email;
    private String phone;
    private List<Invoice> invoices;
    private List<OrderStatusHistory> orderStatusHistories;

}
