package com.program.shop_clothes.domain;


import com.program.shop_clothes.domain.base.BaseDomainAudit;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class Product extends BaseDomainAudit {

    private String alias;
    private String name;
    private String description;
    private BigDecimal price;
    private List<Review> reviews;
    private Category category;
    private List<Image> images;
    private boolean isEnabled;

}
