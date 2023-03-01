package practicascloud.baselineservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import practicascloud.baselineservice.model.CalculusDTOInput;
import practicascloud.baselineservice.model.CalculusDTOOutput;
import practicascloud.baselineservice.service.CalculatorService;

import java.util.List;

@RestController
@RequestMapping("/calculator")
@CrossOrigin(origins = "http://localhost:8080", methods= {RequestMethod.POST, RequestMethod.GET, RequestMethod.DELETE, RequestMethod.OPTIONS})
public class CalculateController {
    @Autowired
    private CalculatorService calculatorService;
    @PostMapping(value = "/interestForm", produces = "application/json;charset=UTF-8")
    public List<CalculusDTOOutput> createCalculus(@RequestBody CalculusDTOInput calculusDTOInput) {
        return calculatorService.interstDataCalculator(calculusDTOInput);
    }
}
