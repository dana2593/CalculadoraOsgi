package com.example.calculator.impl;

import com.example.calculator.CalculatorService;
import org.osgi.service.component.annotations.Component;

@Component(service = CalculatorService.class)
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}