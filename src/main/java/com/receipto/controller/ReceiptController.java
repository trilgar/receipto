package com.receipto.controller;

import com.receipto.models.Receipt;
import com.receipto.service.ReceiptService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/v1/receipts")
@RequiredArgsConstructor
public class ReceiptController {

    private final ReceiptService receiptService;

    @GetMapping
    public Collection<Receipt> getAllReceipts() {
        return receiptService.getAllReceipts();
    }

    @PostMapping
    public Receipt saveReceipt(@RequestBody Receipt receipt) {
        return receiptService.saveReceipt(receipt);
    }
}
