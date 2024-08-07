package com.program.shop_clothes.domain;

import com.program.shop_clothes.domain.base.BaseDomainAudit;
import lombok.*;

import java.util.List;

@Getter
@Setter
public class Import extends BaseDomainAudit {

    private List<ImportDetail> importDetails;
    private String note;

}
