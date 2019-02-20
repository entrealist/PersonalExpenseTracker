package com.cherifcodes.personalexpensetracker.backend;

import java.util.Objects;

public class ExpenseCategoryTotal {

    private String categoryName;
    private double categoryTotal;

    public ExpenseCategoryTotal(String categoryName, double categoryTotal) {
        this.categoryName = categoryName;
        this.categoryTotal = categoryTotal;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public double getCategoryTotal() {
        return categoryTotal;
    }

    public void setCategoryTotal(double categoryTotal) {
        this.categoryTotal = categoryTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExpenseCategoryTotal that = (ExpenseCategoryTotal) o;
        return Double.compare(that.categoryTotal, categoryTotal) == 0 &&
                Objects.equals(categoryName, that.categoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryName, categoryTotal);
    }

    @Override
    public String toString() {
        return "ExpenseCategoryTotal{" +
                "categoryName='" + categoryName + '\'' +
                ", categoryTotal=" + categoryTotal +
                '}';
    }
}