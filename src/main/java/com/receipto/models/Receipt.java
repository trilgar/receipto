package com.receipto.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name="receipt")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Receipt {

    @Id
    @GeneratedValue
    private Integer id;

    // todo add author

    private String title;
    @Lob
    @Column(name = "mainImage")
    private byte[] mainImage;
    private ConsumptionPeriod period;
    private DishType type;
    private Complexity complexity;

    @ElementCollection
    private List<String> ingredients;
    @OneToMany(mappedBy = "receipt", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ReceiptStep> steps;
}
