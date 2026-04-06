package com.example.bankingapplication.Service;

import com.example.bankingapplication.Models.Account;
import com.example.bankingapplication.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServices {
    @Autowired
    AccountRepository ar;
     public String CreateAnAccount(Account acc) {
        ar.save(acc);
        return "Updated Successfully";
    }

    public List<Account> getTheAccounts() {
        return ar.findAll();
    }

    public String deleteTheAccount(long accountNo) {
         ar.deleteById(accountNo);
         return "Deleted Successfully";
    }

    public Optional<Account> getTheAccountById(long id) {
        return ar.findById(id);
    }

    public String depositAmount(long accNo, double amount) {
        int n=ar.DepositAmount(amount,accNo);
        if(n==0){
            return "Give correct Account Number";
        }
        return "Amount Deposited Successfully";
    }
    public void ddepositAmount(long accNo, double amount) {
        int n=ar.DepositAmount(amount,accNo);
    }

    public String withdrawAmount(long accNo, double amount) {
         int n= ar.WithdrawAmount(amount,accNo);
         if(n==0){
             return "An error Accured";
         }
        return "WithDraw Successful";
    }
    public void wwithdrawAmount(long accNo, double amount) {
        int n= ar.WithdrawAmount(amount,accNo);
    }
}
