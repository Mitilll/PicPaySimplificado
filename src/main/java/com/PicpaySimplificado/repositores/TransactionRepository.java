package com.PicpaySimplificado.repositores;

import com.PicpaySimplificado.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
