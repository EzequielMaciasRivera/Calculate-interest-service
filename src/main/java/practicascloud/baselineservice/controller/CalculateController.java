package practicascloud.baselineservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import practicascloud.baselineservice.model.CalculusDTO;
import practicascloud.baselineservice.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
@CrossOrigin(origins = "http://localhost:8080", methods= {RequestMethod.POST, RequestMethod.GET, RequestMethod.DELETE, RequestMethod.OPTIONS})
public class CalculateController {
    @Autowired
    private CalculatorService calculatorService;

    @GetMapping(value = "hola", produces = "application/json;charset=UTF-8")
    public String getObject() {
        // Returns object with calculated interest data
        // List<CalculusDTO> lista = new ArrayList<>();


      //return calculus;
     return "Hola!!";
    }

    @PostMapping("/interestForm")
    public String createCalculus(@RequestBody CalculusDTO calculusDTO) {
        return calculusDTO.toString();
    }
}
