package com.example.bankingapplication.Controller;

import com.example.bankingapplication.Models.Transactions;
import com.example.bankingapplication.Service.TransactionsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionController {
    @Autowired
    TransactionsServices ts;
    @PostMapping("/MakeTransaction")
    public String makeTransaction(@RequestBody Transactions trans){
        return ts.makeATransaction(trans);
    }
    @GetMapping("/Transactions")
    public List<Transactions> getTransactions(){
        return ts.getAllTransactions();
    }
}
