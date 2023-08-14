package controllers;


import data.CalculatorComplex;
import data.Complex;
import model.ModelComplex;

public class V1Controller implements Controller {

    public V1Controller() {}

    public Complex sendComplex(CalculatorComplex calculator) {
        ModelComplex model = new ModelComplex();
        return model.calculate(calculator);
    }
}