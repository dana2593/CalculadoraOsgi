package com.example.client;

import com.example.calculator.CalculatorService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component
public class CalculatorClient {

    @Reference
    private CalculatorService calculatorService;

    @Activate
    public void start() {
        int result = calculatorService.add(5, 3);
        System.out.println("Resultado de 5 + 3: " + result);
    }
}