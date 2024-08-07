package com.program.shop_clothes.use_case.order;

import com.program.shop_clothes.domain.Order;
import java.util.List;

public interface CreateOrderUseCase {
    Order execute(String username, List<String> idCartItems, String address, String phone, String email);
}
