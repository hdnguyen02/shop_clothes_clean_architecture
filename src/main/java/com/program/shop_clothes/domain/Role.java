package com.program.shop_clothes.domain;


import com.program.shop_clothes.domain.base.BaseDomainAudit;
import lombok.*;

import java.util.List;


@Getter
@Setter
public class Role extends BaseDomainAudit {

    private String name;
    private String description;
    private List<User> users;
}
