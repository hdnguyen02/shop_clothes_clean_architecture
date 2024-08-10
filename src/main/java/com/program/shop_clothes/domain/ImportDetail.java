package com.program.shop_clothes.domain;

import com.program.shop_clothes.domain.base.BaseDomain;
import lombok.*;

@Getter
@Setter
public class ImportDetail extends BaseDomain {

    private ProductSize productSize;
    private int quantityProduct;

}
