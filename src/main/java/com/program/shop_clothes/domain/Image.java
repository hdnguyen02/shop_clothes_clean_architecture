package com.program.shop_clothes.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Image {
    private String id;
    private String url;
    private Product product;
}
