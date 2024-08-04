package com.program.shop_clothes.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@Data
@Builder
public class Invoice {

    private String id;
    private Order order;
    private String vnpResponseCode;
    private BigDecimal vnpAmount;
    private String vnpBankCode;
    private String vnpCardType;
    private String vnpOrderInfo;
    private LocalDate vnpPayDate;

}
