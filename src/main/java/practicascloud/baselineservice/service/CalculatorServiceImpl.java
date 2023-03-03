package practicascloud.baselineservice.service;

import org.springframework.stereotype.Service;
import practicascloud.baselineservice.model.CalculusDTOInput;
import practicascloud.baselineservice.model.CalculusDTOOutput;

import java.util.ArrayList;
import java.util.List;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    // Methods
    private int calculateInitialBalance(int year, int initialBalance, int getFinalBalance) {
        // For consecutive years, this value is the same as the getFinalBalance of the previous year.
        int newBalance = 0;
        if (year == 1) {
            return initialBalance;
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
            return annualContribution;
        }
        if (year > 1) {
            double save = 1 + (double) annulIncrease / 100;
            totalContribution = (int) (annualContribution * save);
        }
        return totalContribution;
    }

    private int calculatePerformance(int getInitialBalance, int getContribution, int performance) {
        // totalPerformance = (Initial Balance + Contribution) * (Investment Yield / 100)
        int totalPerformance = 0;
        double perfDivided = (double) performance / 100;
        totalPerformance = (int) ((getInitialBalance + getContribution) * perfDivided);
        return totalPerformance;
    }

    private int calculateFinalBalance(int getInitialBalance, int getContribution, int getPerformance) {
        // Initial balance + Contribution + Performance
        return getInitialBalance + getContribution + getPerformance;
    }

    @Override
    public List<CalculusDTOOutput> interestDataCalculator(CalculusDTOInput inputData) {

        int getInitialBalance = inputData.getInitialBalance();
        int getContribution = inputData.getAnnualContribution();
        int getPerformance = 0;
        int getFinalBalance = 0;
        List<CalculusDTOOutput> response = new ArrayList<>();
        for (int i = 1; i <= inputData.getInvestmentYears(); i++) {
            CalculusDTOOutput calculation = new CalculusDTOOutput();

            getInitialBalance = calculateInitialBalance(i, getInitialBalance, getFinalBalance);

            getContribution = calculateContribution(i, getContribution, inputData.getAnnulIncrease());

            getPerformance = calculatePerformance(getInitialBalance, getContribution, inputData.getPerformance());

            getFinalBalance = calculateFinalBalance(getInitialBalance, getContribution, getPerformance);

            calculation.setYear(i);
            calculation.setInitialBalance(getInitialBalance);
            calculation.setAnnualContribution(getContribution);
            calculation.setPerformance(getPerformance);
            calculation.setEndingBalance(getFinalBalance);

            response.add(calculation);
        }
        return response;
    }
}
