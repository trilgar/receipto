package com.receipto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/receipts")
public class ReceiptController {

    @GetMapping
    public String testEndpoint(){
        return "hello from receipts controller";
    }
}
