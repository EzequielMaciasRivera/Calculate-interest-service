package practicascloud.baselineservice.model;

import java.util.ArrayList;

public class CalculusDTOOput {
    private int year;
    private int initialBalance;
    private int annualContribution;
    private int performance;
    private int endingBalance;

    // Getters and Setters
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(int initialBalance) {
        this.initialBalance = initialBalance;
    }

    public int getAnnualContribution() {
        return annualContribution;
    }

    public void setAnnualContribution(int annualContribution) {
        this.annualContribution = annualContribution;
    }

    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }

    public int getEndingBalance() {
        return endingBalance;
    }

    public void setEndingBalance(int endingBalance) {
        this.endingBalance = endingBalance;
    }
}
