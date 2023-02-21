package practicascloud.baselineservice.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{

    @Override
    public String saludar() {

        return "Hola desde Spring";
    }
}
