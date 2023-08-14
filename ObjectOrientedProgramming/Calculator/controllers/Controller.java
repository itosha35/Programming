package controllers;


import data.CalculatorComplex;
import data.Complex;

public interface Controller {

    Complex sendComplex(CalculatorComplex calculator);
}