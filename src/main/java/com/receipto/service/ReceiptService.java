package com.receipto.service;

import com.receipto.models.Receipt;

import java.util.Collection;

public interface ReceiptService {
    Receipt saveReceipt(Receipt receipt);
    Collection<Receipt> getAllReceipts();
}
