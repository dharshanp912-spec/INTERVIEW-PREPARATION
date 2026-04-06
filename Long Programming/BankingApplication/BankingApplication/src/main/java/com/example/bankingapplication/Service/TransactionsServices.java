package com.example.bankingapplication.Service;

import com.example.bankingapplication.Models.Transactions;
import com.example.bankingapplication.Repository.TransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionsServices {
     @Autowired
    TransactionsRepository tr;
     @Autowired
     AccountServices as;
    public String makeATransaction(Transactions trans) {
        tr.save(trans);
        as.ddepositAmount(trans.getReceiverAccNo(),trans.getAmount());
        as.wwithdrawAmount(trans.getSenderAccNo(),trans.getAmount());
        return "Successfull";
    }

    public List<Transactions> getAllTransactions() {
        return tr.findAll();
    }
}
