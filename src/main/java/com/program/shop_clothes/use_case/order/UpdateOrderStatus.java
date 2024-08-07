package com.program.shop_clothes.use_case.order;

import com.program.shop_clothes.domain.Order;
import com.program.shop_clothes.domain.OrderStatus;

public interface UpdateOrderStatus {

    Order execute(String idOrder, OrderStatus orderStatus);

}
