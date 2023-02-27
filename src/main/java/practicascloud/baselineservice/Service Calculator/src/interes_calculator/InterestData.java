package interes_calculator;

public class InterestData {
  private int initialBalance;
  private int annualContribution;
  private int annulIncrease;
  private int investmentYears;
  private int performance;

  public InterestData() {
    initialBalance = 0;
    annualContribution = 0;
    annulIncrease = 0;
    investmentYears = 0;
    performance = 0;
  }

  // Method overloading
  public InterestData(int initialBalance, int annualContribution, int annulIncrease,
      int investmentYears, int performance) {
    this.initialBalance = initialBalance;
    this.annualContribution = annualContribution;
    this.annulIncrease = annulIncrease;
    this.investmentYears = investmentYears;
    this.performance = performance;
  }

  // Methods
  int calculateYears(int year) {
    int yearCounter = 0;
    if (year == 1) {
      return yearCounter = year;
    }
    if (year > 1) {
      yearCounter = year++;
    }
    return yearCounter;
  }

  int calculateInitialBalance(int year, int initialBalance, int getFinalBalance) {
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

  int calculateContribution(int year, int annualContribution, int annulIncrease) {
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

  int calculatePerformance(int getInitialBalance, int getContribution, int performance) {
    // Rendimiento = (Saldo inicial + Aportación) * (Rendimiento de inversión / 100)
    int totalPerformnace = 0;
    int SalIniAndContri = getInitialBalance + getContribution;
    double perfDivided = (double) performance / 100;
    totalPerformnace = (int) (SalIniAndContri * perfDivided);
    return totalPerformnace;
  }

  int calculateFinalBalance(int getInitialBalance, int getContribution, int getPerformance) {
    // Initial balance + Contribution + Performance
    int finalBalance = getInitialBalance + getContribution + getPerformance;
    return finalBalance;
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
