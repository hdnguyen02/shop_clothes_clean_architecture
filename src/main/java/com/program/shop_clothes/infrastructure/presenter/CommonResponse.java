package com.program.shop_clothes.infrastructure.presenter;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CommonResponse {

    private String message;
    private int status;
    private Object data;

}
