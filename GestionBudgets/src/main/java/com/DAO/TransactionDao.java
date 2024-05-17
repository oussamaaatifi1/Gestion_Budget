package com.DAO;


import java.util.List;

import com.Beans.Transaction;
import com.DAO.TransactionDao;

public interface TransactionDao {
    void addTransaction(Transaction transaction);
    void editTransaction(Transaction transaction);
    void deleteTransaction(int transactionId);
    List<Transaction> getAllTransactions();

}
