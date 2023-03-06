package practicascloud.baselineservice.service;

import org.springframework.stereotype.Service;
import practicascloud.baselineservice.model.CalculusDTOInput;
import practicascloud.baselineservice.model.CalculusDTOOutput;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    // Methods
    private double calculateInitialBalance(int year, double initialBalance, double getFinalBalance) {
        // For consecutive years, this value is the same as the getFinalBalance of the previous year.
        double newBalance = 0;
        if (year == 1) {
            return initialBalance;
        }
        if (year > 1) {
            newBalance = getFinalBalance;
        }
        return newBalance;
    }

    private double calculateContribution(int year, double annualContribution, double annulIncrease) {
        // For the first year (beginning of the investment), this value is the same as the annual
        // contribution.
        // For subsequent years, this value is calculated as follows:
        // Contribution = (Annual contribution of the previous year) * (1 + (% Increase in contribution
        // / 100))

        double totalContribution = 0;
        if (year == 1) {
            return annualContribution;
        }
        if (year > 1) {
            double save = 1 + annulIncrease / 100;
            totalContribution = annualContribution * save;
        }
        return totalContribution;
    }

    private double calculatePerformance(double getInitialBalance, double getContribution, double performance) {
        // totalPerformance = (Initial Balance + Contribution) * (Investment Yield / 100)
        double totalPerformance = 0;
        double perfDivided = performance / 100;
        totalPerformance = ((getInitialBalance + getContribution) * perfDivided);
        return totalPerformance;
    }

    private double calculateFinalBalance(double getInitialBalance, double getContribution, double getPerformance) {
        // Initial balance + Contribution + Performance
        return getInitialBalance + getContribution + getPerformance;
    }

    @Override
    public List<CalculusDTOOutput> interestDataCalculator(CalculusDTOInput inputData) {

        double getInitialBalance = inputData.getInitialBalance();
        double getContribution = inputData.getAnnualContribution();
        double getPerformance = 0;
        double getFinalBalance = 0;
        List<CalculusDTOOutput> response = new ArrayList<>();
        for (int i = 1; i <= inputData.getInvestmentYears(); i++) {
            CalculusDTOOutput calculation = new CalculusDTOOutput();

            getInitialBalance = calculateInitialBalance(i, getInitialBalance, getFinalBalance);

            getContribution = calculateContribution(i, getContribution, inputData.getAnnulIncrease());

            getPerformance = calculatePerformance(getInitialBalance, getContribution, inputData.getPerformance());

            getFinalBalance = calculateFinalBalance(getInitialBalance, getContribution, getPerformance);

            DecimalFormat decimal = new DecimalFormat("#.00");

            calculation.setYear(i);
            calculation.setInitialBalance(Double.parseDouble(decimal.format(getInitialBalance)));
            calculation.setAnnualContribution(Double.parseDouble(decimal.format(getContribution)));
            calculation.setPerformance(Double.parseDouble(decimal.format(getPerformance)));
            calculation.setEndingBalance(Double.parseDouble(decimal.format(getFinalBalance)));

            response.add(calculation);
        }
        return response;
    }
}
