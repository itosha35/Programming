package model;

import data.*;

public class ModelComplex implements Model {

    @Override
    public Complex calculate(Calculator calc) {
        switch (calc.getOperation()) {
            case '+' -> {
                return new ComplexSum().getExecute(calc.getNumOne(), calc.getNumTwo());
            }
            case '-' -> {
                return new ComplexDiff().getExecute(calc.getNumOne(), calc.getNumTwo());
            }
            case '/' -> {
                return new ComplexDiv().getExecute(calc.getNumOne(), calc.getNumTwo());
            }
            case '*' -> {
                return new ComplexMulti().getExecute(calc.getNumOne(), calc.getNumTwo());
            }
        }
        return null;
    }
}
