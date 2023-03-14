package com.receipto.service;

import com.receipto.models.Receipt;
import com.receipto.models.request.ReceiptRequest;

import java.util.Collection;

public interface ReceiptService {
    Receipt saveReceipt(Receipt receipt);
    Receipt saveReceipt(ReceiptRequest receipt);
    Collection<Receipt> getAllReceipts();
}
