package practicascloud.baselineservice.service;

public interface CalculatorService {
    //String saludar();
    int calculateYears(int year);
    int calculateInitialBalance(int year, int initialBalance, int getFinalBalance);
    int calculateContribution(int year, int annualContribution, int annulIncrease);
    int calculatePerformance(int getInitialBalance, int getContribution, int performance);
    int calculateFinalBalance(int getInitialBalance, int getContribution, int getPerformance);
}
