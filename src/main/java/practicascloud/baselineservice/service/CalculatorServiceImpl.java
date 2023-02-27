package practicascloud.baselineservice.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{

    // @Override
    //public String saludar() {

      //  return "Hola desde Spring";
    //}

    // Methods
    @Override
    public int calculateYears(int year) {
        int yearCounter = 0;
        if (year == 1) {
            return yearCounter = year;
        }
        if (year > 1) {
            yearCounter = year++;
        }
        return yearCounter;
    }
    @Override
    public int calculateInitialBalance(int year, int initialBalance, int getFinalBalance) {
        // For consecutive years, this value is the same as the getFinalBalance of the previous year.
        int newBalance = 0;
        if (year == 1) {
            return newBalance = initialBalance;
        }
        if (year > 1) {
            newBalance = getFinalBalance;
        }
        return newBalance;
    }
    @Override
    public int calculateContribution(int year, int annualContribution, int annulIncrease) {
        // For the first year (beginning of the investment), this value is the same as the annual
        // contribution.
        // For subsequent years, this value is calculated as follows:
        // Contribution = (Annual contribution of the previous year) * (1 + (% Increase in contribution
        // / 100))

        int totalContribution = 0;
        if (year == 1) {
            return totalContribution = annualContribution;
        }
        if (year > 1) {
            double save = 1 + (double) annulIncrease / 100;
            totalContribution = (int) (annualContribution * save);
        }
        return totalContribution;
    }
    @Override
    public int calculatePerformance(int getInitialBalance, int getContribution, int performance) {
        // Rendimiento = (Saldo inicial + Aportación) * (Rendimiento de inversión / 100)
        int totalPerformnace = 0;
        int SalIniAndContri = getInitialBalance + getContribution;
        double perfDivided = (double) performance / 100;
        totalPerformnace = (int) (SalIniAndContri * perfDivided);
        return totalPerformnace;
    }

    public int calculateFinalBalance(int getInitialBalance, int getContribution, int getPerformance) {
        // Initial balance + Contribution + Performance
        int finalBalance = getInitialBalance + getContribution + getPerformance;
        return finalBalance;
    }
}
