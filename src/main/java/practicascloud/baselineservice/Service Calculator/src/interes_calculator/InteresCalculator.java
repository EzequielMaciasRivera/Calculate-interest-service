/**
 * 
 */
package interes_calculator;

import java.util.Scanner;

/**
 * @author ezmacias
 *
 */
public class InteresCalculator {
  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub

    try (// Declaration of the scanner to enter data
        Scanner read = new Scanner(System.in)) {
      // Size of array of objects to stores
      // int years = 0;
      // System.out.println("Ingresa la cantidad de años de inversión:");
      // years = read.nextInt();
      // Build object array
      InterestData investmentDataObject[] = new InterestData[1]; // Declaration and
                                                                 // Instance of object
                                                                 // array
      InterestData methods;// Declaration of methods
      methods = new InterestData(); // Instance of methods
      // Variables to save the user data
      int initialBalance = 0;
      int annualContribution = 0;
      int annulIncrease = 0;
      int investmentYears = 0;
      int performance = 0;

      // Cycle to do the steps
      for (int i = 0; i < investmentDataObject.length; i++) {
        System.out.println("###################################################");
        System.out.println("Ingresa el monto $ de tu inversión inicial:");
        initialBalance = read.nextInt();
        System.out.println("Ingresa el monto $ de tu aportación anual:");
        annualContribution = read.nextInt();
        System.out.println("Ingresa el porcentaje % de incremento anual que deseas:");
        annulIncrease = read.nextInt();
        System.out.println("Ingresa la cantidad de años de inversión que deseas calcular:");
        investmentYears = read.nextInt();
        System.out.println("Ingresa el porcentaje % de inversión ficticia que deseas calcular:");
        performance = read.nextInt();
        read.nextLine();
        investmentDataObject[i] = new InterestData(initialBalance, annualContribution,
            annulIncrease, investmentYears, performance);
      }
      // Calculate interest
      int year = 0;
      int getYear = 0;
      int getInitialBalance = 0;
      int getContribution = 0;
      int getPerformance = 0;
      int getFinalBalance = 0;
      while (investmentYears > 0) {

        for (int i = 0; i < investmentDataObject.length; i++) {
          year++;
          ////
          getYear = methods.calculateYears(year);

          getInitialBalance = methods.calculateInitialBalance(getYear,
              investmentDataObject[i].getInitialBalance(), getFinalBalance);

          getContribution = methods.calculateContribution(getYear,
              investmentDataObject[i].getAnnualContribution(),
              investmentDataObject[i].getAnnulIncrease());

          getPerformance = methods.calculatePerformance(getInitialBalance, getContribution,
              investmentDataObject[i].getPerformance());

          getFinalBalance =
              methods.calculateFinalBalance(getInitialBalance, getContribution, getPerformance);

          investmentDataObject[i] = new InterestData(getInitialBalance, getContribution,
              annulIncrease, investmentYears, performance);
          ///
          ///
          System.out.println("Año: " + getYear);
          System.out.println("Saldo inicial: " + getInitialBalance);
          System.out.println("Aportación: " + getContribution);
          System.out.println("Rendimiento: " + getPerformance);
          System.out.println("Saldo final: " + getFinalBalance);
          System.out.println("#################" + "\n");
        }
        investmentYears--;
      }
    }
  }
}
