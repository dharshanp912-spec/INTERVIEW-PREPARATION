package com.example.bankingapplication.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Component
public class Account {
    @Id
    long accountNo;
    String accountType;
    String holderName;
    String branch;
    double balance;
    String email;
}
