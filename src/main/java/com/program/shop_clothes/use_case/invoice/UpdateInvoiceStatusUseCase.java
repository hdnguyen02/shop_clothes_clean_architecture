package com.program.shop_clothes.use_case.invoice;

import com.program.shop_clothes.domain.Invoice;
import com.program.shop_clothes.domain.InvoiceStatus;

public interface UpdateInvoiceStatusUseCase {
    Invoice execute(String idInvoice, InvoiceStatus invoiceStatus);
}
