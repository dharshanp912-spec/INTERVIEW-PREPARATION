package com.example.bankingapplication.Controller;

import com.example.bankingapplication.Models.Account;
import com.example.bankingapplication.Service.AccountServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Accountcontroller {
    @Autowired
    AccountServices ac;
    @GetMapping("/getAccounts")
    public List<Account> getAccounts(){
        return ac.getTheAccounts();
    }
    @PostMapping("/create")
    public String createAccount(@RequestBody Account acc){
        return ac.CreateAnAccount(acc);
    }
    @DeleteMapping("/delete")
    public String deleteAccount(@RequestBody long accountNo){
        return ac.deleteTheAccount(accountNo);
    }
    @GetMapping("/getAccount/{id}")
    public Optional<Account> getAccountById(@PathVariable long id){
        return ac.getTheAccountById(id);
    }
    public String deposit(@RequestBody long accNo,double Amount){
        return ac.depositAmount(accNo,Amount);
    }
    public String withdraw(@RequestBody long accNo,double Amount){
      return  ac.withdrawAmount(accNo,Amount);
    }
    
}
