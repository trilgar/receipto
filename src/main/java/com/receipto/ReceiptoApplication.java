package com.receipto;

import com.receipto.models.*;
import com.receipto.service.ReceiptService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@SpringBootApplication
@EnableJpaRepositories("com.receipto.repository")
@RequiredArgsConstructor
public class ReceiptoApplication {
    private final ReceiptService receiptService;

    public static void main(String[] args) {
        SpringApplication.run(ReceiptoApplication.class, args);
    }

    @Bean
    public CommandLineRunner initDBWithDummyValues() {
        return (args) -> {
            Receipt receipt = Receipt.builder()
                    .title("Huge cool receipt")
                    .period(ConsumptionPeriod.DINNER)
                    .ingredients(List.of("pasley", "onion", "cucumber", "meat"))
                    .type(DishType.DESSERT)
                    .complexity(Complexity.MEDIUM)
                    .build();
            receipt.setSteps(
                    List.of(
                            new ReceiptStep(1, "1 step text", receipt),
                            new ReceiptStep(2, "2 step text", receipt),
                            new ReceiptStep(3, "3 step text", receipt))
            );
            receiptService.saveReceipt(receipt);
        };
    }

}
