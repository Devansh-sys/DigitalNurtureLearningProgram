// AccountApplication.java
package com.example.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);
    }
}
```java
// AccountController.java
package com.example.account.controller;

import com.example.account.model.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final List<Account> accounts = Arrays.asList(
            new Account("1", "Savings", "John Doe"),
            new Account("2", "Current", "Jane Smith"),
            new Account("3", "Stock Trading", "Peter Jones"),
            new Account("4", "Fixed Deposits", "Mary Williams"),
            new Account("5", "Recurring Deposits", "David Brown")
    );

    @GetMapping
    public List<Account> getAllAccounts() {
        return accounts;
    }

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable String id) {
        return accounts.stream()
                .filter(account -> account.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
```java
// Account.java
package com.example.account.model;

public class Account {
    private String id;
    private String type;
    private String holderName;

    public Account(String id, String type, String holderName) {
        this.id = id;
        this.type = type;
        this.holderName = holderName;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
}
