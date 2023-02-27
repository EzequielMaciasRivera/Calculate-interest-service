package practicascloud.baselineservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
// @AllArgsConstructor
@Data
public class CalculusDTO {
    @Override
    public String toString() {
        return "CalculusDTO{" +
                "initialBalance=" + initialBalance +
                ", annualContribution=" + annualContribution +
                ", annulIncrease=" + annulIncrease +
                ", investmentYears=" + investmentYears +
                ", performance=" + performance +
                '}';
    }

    private int initialBalance;
    private int annualContribution;
    private int annulIncrease;
    private int investmentYears;
    private int performance;

    public CalculusDTO() {
        initialBalance = 0;
        annualContribution = 0;
        annulIncrease = 0;
        investmentYears = 0;
        performance = 0;
    }

    // Method overloading
    public CalculusDTO(int initialBalance, int annualContribution, int annulIncrease,
                        int investmentYears, int performance) {
        this.initialBalance = initialBalance;
        this.annualContribution = annualContribution;
        this.annulIncrease = annulIncrease;
        this.investmentYears = investmentYears;
        this.performance = performance;
    }

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
