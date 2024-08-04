package com.program.shop_clothes.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class Order {

    private String id;
    private List<OrderDetail> orderDetails;
    private User user;
    private LocalDate timestamp;
    private String address;
    private List<OrderStatusHistory> orderStatusHistories;

}
