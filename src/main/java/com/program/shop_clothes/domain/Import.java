package com.program.shop_clothes.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class Import {

    private String id;
    private LocalDate timestamp;
    private List<ImportDetail> importDetails;
    private String message;
}
