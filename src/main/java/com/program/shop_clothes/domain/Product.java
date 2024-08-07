package com.program.shop_clothes.domain;


import com.program.shop_clothes.domain.base.BaseDomainAudit;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class Product extends BaseDomainAudit {

    private String alias;
    private String name;
    private String description;
    private BigDecimal price;
    private List<Size> sizes;
    private List<Category> categories;
    private List<Review> reviews;
    private List<Image> images;
    private boolean isEnabled;

}
