package com.program.shop_clothes.use_case.order;

import com.program.shop_clothes.domain.Order;

public interface GetOrderUseCase {

    Order execute(String idOrder);

}
