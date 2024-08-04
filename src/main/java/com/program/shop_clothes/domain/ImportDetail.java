package com.program.shop_clothes.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class ImportDetail {

    private String id;
    private Import anImport;
    private ProductSize productSize;
    private int quantityProduct;
}
