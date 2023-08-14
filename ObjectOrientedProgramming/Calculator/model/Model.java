package model;


import data.Calculator;
import data.Complex;

public interface Model {
    Complex calculate(Calculator calculator);
}