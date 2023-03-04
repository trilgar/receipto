package com.receipto.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReceiptStep {
    @Id
    @GeneratedValue
    private Integer id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "receipt_id", nullable = false)
    private Receipt receipt;

    private Integer orderNumber;
    @Lob
    private byte[] image;
    private String text;

    public ReceiptStep(Integer orderNumber, String text, Receipt receipt) {
        this.orderNumber = orderNumber;
        this.text = text;
        this.receipt = receipt;
    }
}
