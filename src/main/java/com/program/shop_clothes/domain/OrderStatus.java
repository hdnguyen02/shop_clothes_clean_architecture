package com.program.shop_clothes.domain;

public enum OrderStatus {
    PENDING,
    PROCESSING,
    SHIPPED,
    DELIVERED,
    CANCELED,
    REQUESTED_RETURN,
    APPROVED_RETURN,
    REJECTED_RETURN,
    RETURNED,
    REFUNDED
}
