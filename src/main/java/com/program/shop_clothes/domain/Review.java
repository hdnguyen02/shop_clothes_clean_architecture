package com.program.shop_clothes.domain;

import com.program.shop_clothes.domain.base.BaseDomainAudit;
import lombok.*;


@Getter
@Setter
public class Review extends BaseDomainAudit {

    private User user;
    private Product product;
    private String content;
    private int star;

}