package com.program.shop_clothes.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@AllArgsConstructor
@Data
@Builder
public class OrderStatusHistory {

    private String id;
    private Order order;
    private OrderStatus orderStatus;
    private LocalDate timestamp;

}
