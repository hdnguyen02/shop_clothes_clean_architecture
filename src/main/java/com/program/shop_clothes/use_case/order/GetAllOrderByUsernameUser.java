package com.program.shop_clothes.use_case.order;

import com.program.shop_clothes.domain.Order;

import java.util.List;

public interface GetAllOrderByUsernameUser {

    List<Order> execute(String usernameUser);

}
