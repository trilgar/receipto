package com.receipto.models.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ReceiptRequest {
    private String title;
    private String mainImage;
}
