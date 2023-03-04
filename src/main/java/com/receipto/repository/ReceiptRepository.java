package com.receipto.repository;

import com.receipto.models.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ReceiptRepository extends JpaRepository<Receipt, Integer> {
}
