package com.receipto.controller;

import com.receipto.models.Receipt;
import com.receipto.repository.ReceiptRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/v1/receipts")
@RequiredArgsConstructor
public class ReceiptController {

    private final ReceiptRepository receiptRepository;
    @GetMapping
    public Collection<Receipt> getAllReceipts(){
        return receiptRepository.findAll();
    }
}
