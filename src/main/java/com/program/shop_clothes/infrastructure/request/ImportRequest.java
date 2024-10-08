package com.program.shop_clothes.infrastructure.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ImportRequest {

    private Map<String, Integer> mapImportDetails;
    private String message;

}
