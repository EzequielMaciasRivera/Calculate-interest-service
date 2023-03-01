package practicascloud.baselineservice.service;

import practicascloud.baselineservice.model.CalculusDTO;
import practicascloud.baselineservice.model.CalculusDTOOput;

import java.util.List;

public interface CalculatorService {
    //String saludar();
    List <CalculusDTOOput> interstDataCalculator(CalculusDTO inputData);
}
