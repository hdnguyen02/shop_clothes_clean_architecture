package com.program.shop_clothes.use_case.order_status_history;

import com.program.shop_clothes.domain.OrderStatus;
import com.program.shop_clothes.domain.OrderStatusHistory;

public interface CreateOrderStatusHistoryUseCase {

    OrderStatusHistory execute(String idOrder, OrderStatus orderStatus);

}
