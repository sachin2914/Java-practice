package com.program;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Transaction {
    private LocalDate date;
    private double amount;

    public Transaction(LocalDate date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }
}

public class TransactionSummary {
    public static void main(String[] args) {
        List<Transaction> transactions = List.of(
                new Transaction(LocalDate.of(2024, 1, 1), 100.0),
                new Transaction(LocalDate.of(2024, 1, 1), 200.0),
                new Transaction(LocalDate.of(2024, 1, 2), 150.0),
                new Transaction(LocalDate.of(2024, 1, 2), 250.0),
                new Transaction(LocalDate.of(2024, 1, 3), 300.0)
        );

        Map<LocalDate, Double> dailySums = transactions.stream()
                .collect(Collectors.groupingBy(
                        Transaction::getDate,
                        Collectors.summingDouble(Transaction::getAmount)
                ));

        dailySums.forEach((date, sum) -> System.out.println(date + ": " + sum));
    }
}