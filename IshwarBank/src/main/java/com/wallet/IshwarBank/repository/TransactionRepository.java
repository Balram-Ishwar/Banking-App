package com.wallet.IshwarBank.repository;

import com.wallet.IshwarBank.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,String> {
}
