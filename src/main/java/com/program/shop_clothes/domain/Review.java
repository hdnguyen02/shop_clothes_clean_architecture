package com.program.shop_clothes.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Review {

    private String id;
    private User user;
    private OrderDetail orderDetail;
    private String content;
    private int star;

}
