// LoanApplication.java
package com.example.loan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoanApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoanApplication.class, args);
    }
}
```java
// LoanController.java
package com.example.loan.controller;

import com.example.loan.model.Loan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/loans")
public class LoanController {

    private final List<Loan> loans = Arrays.asList(
            new Loan("1", "Personal", 50000.0),
            new Loan("2", "Car", 250000.0),
            new Loan("3", "Gold", 100000.0),
            new Loan("4", "Two Wheeler", 75000.0)
    );

    @GetMapping
    public List<Loan> getAllLoans() {
        return loans;
    }

    @GetMapping("/{id}")
    public Loan getLoanById(@PathVariable String id) {
        return loans.stream()
                .filter(loan -> loan.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
```java
// Loan.java
package com.example.loan.model;

public class Loan {
    private String id;
    private String type;
    private Double amount;

    public Loan(String id, String type, Double amount) {
        this.id = id;
        this.type = type;
        this.amount = amount;
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

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
