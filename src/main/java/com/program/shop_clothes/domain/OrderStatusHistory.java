package com.program.shop_clothes.domain;


import com.program.shop_clothes.domain.base.BaseDomainAudit;
import lombok.*;

@Getter
@Setter
public class OrderStatusHistory extends BaseDomainAudit {

    private Order order;
    private OrderStatus orderStatus;

}
