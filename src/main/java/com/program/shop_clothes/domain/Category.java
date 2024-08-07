package com.program.shop_clothes.domain;


import com.program.shop_clothes.domain.base.BaseDomainAudit;
import lombok.*;

import java.util.List;

@Getter
@Setter
public class Category extends BaseDomainAudit {

    private String alias;
    private String name;
    private String description;
    private List<Product> products;

}
