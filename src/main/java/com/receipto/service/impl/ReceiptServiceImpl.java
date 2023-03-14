package com.receipto.service.impl;

import com.receipto.models.Receipt;
import com.receipto.models.request.ReceiptRequest;
import com.receipto.repository.ReceiptRepository;
import com.receipto.service.ReceiptService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Base64;
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
    public Receipt saveReceipt(ReceiptRequest receiptRequest) {
        byte[] imageBytes = Base64.getDecoder().decode(receiptRequest.getMainImage().split(",")[1]);
        Receipt receipt = Receipt.builder()
                .title(receiptRequest.getTitle())
                .mainImage(imageBytes)
                .build();
        return receiptRepository.save(receipt);
    }

    @Override
    public Collection<Receipt> getAllReceipts() {
        return receiptRepository.findAll();
    }
}
