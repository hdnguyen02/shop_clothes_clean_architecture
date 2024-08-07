package com.program.shop_clothes.use_case.invoice;

import com.program.shop_clothes.domain.Invoice;

import java.util.List;

public interface GetAllInvoiceUseCase {
    List<Invoice> execute();
}
