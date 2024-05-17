package com.panchalprogrammingacademy;

import com.Beans.Transaction;
import com.DAO.TransactionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;


@Controller
@RequestMapping("/transactions")
public class TransactionController {
//    private TransactionDao transactionDao;
//
//    @Autowired
//    public TransactionController(TransactionDao transactionDao) {
//        this.transactionDao = transactionDao;
//    }
//
//    @GetMapping("/list")
//    public ModelAndView getAllTransactions() {
//        List<Transaction> transactions = transactionDao.getAllTransactions();
//        ModelAndView modelAndView = new ModelAndView("transaction-list");
//        modelAndView.addObject("transactions", transactions);
//        return modelAndView;
//    }
//
//    @PostMapping("/add")
//    public String addTransaction(@ModelAttribute("transaction") Transaction transaction) {
//        transactionDao.addTransaction(transaction);
//        return "redirect:/transactions/list";
//    }

}

