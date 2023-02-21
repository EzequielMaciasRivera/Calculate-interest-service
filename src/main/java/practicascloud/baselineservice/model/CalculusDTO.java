package practicascloud.baselineservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class CalculusDTO {
    private int initialInvestment;
    private int annualContribution;
    private int annualIncrease;
    private int yearsOfInvestment;
    private int performance;

    public CalculusDTO() {

    }

    public int getInitialInvestment() {
        return initialInvestment;
    }

    public void setInitialInvestment(int initialInvestment) {
        this.initialInvestment = initialInvestment;
    }

    public int getAnnualContribution() {
        return annualContribution;
    }

    public void setAnnualContribution(int annualContribution) {
        this.annualContribution = annualContribution;
    }

    public int getAnnualIncrease() {
        return annualIncrease;
    }

    public void setAnnualIncrease(int annualIncrease) {
        this.annualIncrease = annualIncrease;
    }

    public int getYearsOfInvestment() {
        return yearsOfInvestment;
    }

    public void setYearsOfInvestment(int yearsOfInvestment) {
        this.yearsOfInvestment = yearsOfInvestment;
    }

    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }
}
