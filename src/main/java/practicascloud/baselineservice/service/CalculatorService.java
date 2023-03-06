package practicascloud.baselineservice.service;

import practicascloud.baselineservice.model.CalculusDTOInput;
import practicascloud.baselineservice.model.CalculusDTOOutput;

import java.util.List;

public interface CalculatorService {
   List <CalculusDTOOutput> interestDataCalculator(CalculusDTOInput inputData);
}
