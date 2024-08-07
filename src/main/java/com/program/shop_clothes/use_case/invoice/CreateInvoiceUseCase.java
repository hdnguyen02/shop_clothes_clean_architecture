package com.program.shop_clothes.use_case.invoice;

import com.program.shop_clothes.domain.Invoice;
import com.program.shop_clothes.domain.InvoiceStatus;
import com.program.shop_clothes.domain.PaymentMethod;

public interface CreateInvoiceUseCase {

    Invoice execute(String idOrder, String amount, PaymentMethod paymentMethod, InvoiceStatus invoiceStatus);

}
