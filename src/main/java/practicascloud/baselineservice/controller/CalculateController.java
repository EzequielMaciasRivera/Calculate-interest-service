package practicascloud.baselineservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import practicascloud.baselineservice.model.CalculusDTO;
import practicascloud.baselineservice.service.CalculatorService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("saludo")
@CrossOrigin
public class CalculateController {
    @Autowired
    private CalculatorService calculatorService;

    @GetMapping(value = "hola", produces = "application/json;charset=UTF-8")
    public CalculusDTO getObject(){
        // Returns object with calculated interest data
        List<CalculusDTO> lista = new ArrayList<>();

        CalculusDTO calculus = new CalculusDTO();
        calculus.setInitialInvestment(5000);
        calculus.setAnnualContribution(3000);
        calculus.setAnnualIncrease(1);
        calculus.setYearsOfInvestment(5);
        calculus.setPerformance(21);
        return calculus;
        // return calculatorService.saludar();
    }
}
