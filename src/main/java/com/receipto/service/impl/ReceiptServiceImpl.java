package com.receipto.service.impl;

import com.receipto.models.Receipt;
import com.receipto.repository.ReceiptRepository;
import com.receipto.service.ReceiptService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class ReceiptServiceImpl implements ReceiptService {
    private final ReceiptRepository receiptRepository;

    @Override
    public Receipt saveReceipt(Receipt receipt) {
        return receiptRepository.save(receipt);
    }

    @Override
    public Collection<Receipt> getAllReceipts() {
        return receiptRepository.findAll();
    }
}
