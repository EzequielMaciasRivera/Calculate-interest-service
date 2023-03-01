package practicascloud.baselineservice.model;

import lombok.Data;
@Data
public class CalculusDTOInput {
    private int initialBalance;
    private int annualContribution;
    private int annulIncrease;
    private int investmentYears;
    private int performance;

    // Getters and Setters methods
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

    public int getAnnulIncrease() {
        return annulIncrease;
    }

    public void setAnnulIncrease(int annulIncrease) {
        this.annulIncrease = annulIncrease;
    }

    public int getInvestmentYears() {
        return investmentYears;
    }

    public void setInvestmentYears(int investmentYears) {
        this.investmentYears = investmentYears;
    }

    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }
}
