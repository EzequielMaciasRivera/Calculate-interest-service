package practicascloud.baselineservice.model;

import lombok.Data;
@Data
public class CalculusDTOInput {
    private double initialBalance;
    private double annualContribution;
    private double annulIncrease;
    private int investmentYears;
    private double performance;

    // Getters and Setters methods
    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public double getAnnualContribution() {
        return annualContribution;
    }

    public void setAnnualContribution(double annualContribution) {
        this.annualContribution = annualContribution;
    }

    public double getAnnulIncrease() {
        return annulIncrease;
    }

    public void setAnnulIncrease(double annulIncrease) {
        this.annulIncrease = annulIncrease;
    }

    public int getInvestmentYears() {
        return investmentYears;
    }

    public void setInvestmentYears(int investmentYears) {
        this.investmentYears = investmentYears;
    }

    public double getPerformance() {
        return performance;
    }

    public void setPerformance(double performance) {
        this.performance = performance;
    }
}
