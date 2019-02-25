package com.cherifcodes.personalexpensetracker.backend;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.text.TextUtils;

import java.time.LocalDateTime;

@Entity
public class Expense {
    @PrimaryKey (autoGenerate = true)
    private int id;
    private String category;
    private double amount;
    private String businessName;
    private LocalDateTime date;

    public Expense(String category, String businessName, double amount, LocalDateTime date) {
        this.setCategory(category);
        this.setBusinessName(businessName);
        this.setAmount(amount);
        this.setDate(date);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }

    public String getBusinessName() {
        return businessName;
    }

    public LocalDateTime  getDate() {
        return date;
    }

    public void setCategory(String category) {
        if (TextUtils.isEmpty(category))
            throw new IllegalArgumentException("Invalid category.");
        this.category = category;
    }

    public void setAmount(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Invalid expense amount.");
        this.amount = amount;
    }

    public void setBusinessName(String businessName) {
        if (TextUtils.isEmpty(businessName))
            throw new IllegalArgumentException("Invalid business name.");
        this.businessName = businessName;
    }

    public void setDate(LocalDateTime  date) {
        // Throw an error if date is before yesterday's date.
        if (date == null /*|| date.compareTo(LocalDateTime.now().minusDays(1)) < 0*/)
            throw new IllegalArgumentException("Invalid expense date.");
        this.date = date;
    }

    @Override
    public String toString() {
        return "Id: " + this.id + ", Category: " + this.category +
                ", Business name: " + this.businessName +
                ", Amount: " + this.amount + ", Date: " + this.date;
    }
}
