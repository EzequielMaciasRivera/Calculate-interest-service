package practicascloud.baselineservice.service;

import org.springframework.stereotype.Service;
import practicascloud.baselineservice.model.CalculusDTOInput;
import practicascloud.baselineservice.model.CalculusDTOOutput;

import java.util.ArrayList;
import java.util.List;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    // @Override
    //public String saludar() {

    //  return "Hola desde Spring";
    //}

    // Methods
    private int calculateYears(int year) {
        int yearCounter = 0;
        if (year == 1) {
            return yearCounter = year;
        }
        if (year > 1) {
            yearCounter = year++;
        }
        return yearCounter;
    }

    private int calculateInitialBalance(int year, int initialBalance, int getFinalBalance) {
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

    private int calculateContribution(int year, int annualContribution, int annulIncrease) {
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

    private int calculatePerformance(int getInitialBalance, int getContribution, int performance) {
        // Rendimiento = (Saldo inicial + Aportación) * (Rendimiento de inversión / 100)
        int totalPerformnace = 0;
        int SalIniAndContri = getInitialBalance + getContribution;
        double perfDivided = (double) performance / 100;
        totalPerformnace = (int) (SalIniAndContri * perfDivided);
        return totalPerformnace;
    }

    private int calculateFinalBalance(int getInitialBalance, int getContribution, int getPerformance) {
        // Initial balance + Contribution + Performance
        int finalBalance = getInitialBalance + getContribution + getPerformance;
        return finalBalance;
    }

    @Override
    public List<CalculusDTOOutput> interstDataCalculator(CalculusDTOInput inputData) {

        int getYear = 0;
        int getInitialBalance = inputData.getInitialBalance();
        int getContribution = inputData.getAnnualContribution();
        int getPerformance = 0;
        int getFinalBalance = 0;
        List<CalculusDTOOutput> response = new ArrayList<>();
        for (int i = 1; i <= inputData.getInvestmentYears(); i++) {
            CalculusDTOOutput calculation = new CalculusDTOOutput();
            ////
            getYear = calculateYears(i);

            getInitialBalance = calculateInitialBalance(getYear, getInitialBalance, getFinalBalance);

            getContribution = calculateContribution(getYear, getContribution, inputData.getAnnulIncrease());

            getPerformance = calculatePerformance(getInitialBalance, getContribution, inputData.getPerformance());

            getFinalBalance = calculateFinalBalance(getInitialBalance, getContribution, getPerformance);

            calculation.setYear(getYear);
            calculation.setInitialBalance(getInitialBalance);
            calculation.setAnnualContribution(getContribution);
            calculation.setPerformance(getPerformance);
            calculation.setEndingBalance(getFinalBalance);

            response.add(calculation);
        }
        return response;
    }
}
