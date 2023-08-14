package data;

public class CalculatorComplex implements Calculator {

    protected Complex numOne;
    protected final Complex numTwo;
    protected char operation;

    public CalculatorComplex(String in) {
        char[] chars = in.toCharArray();
        StringBuilder temp = new StringBuilder();
        double re;
        double im;
        for (char ch : chars) {
            if (ch == '/' || ch == '*' || ch == '+' || ch == '-') {
                operation = ch;
                String[] complex = temp.toString().strip().split(" ");
                re = Double.parseDouble(complex[0]);
                im = Double.parseDouble(complex[1]);
                numOne = new Complex(re, im);
                temp = new StringBuilder();
            } else temp.append(ch);
        }
        String[] complex = temp.toString().strip().split(" ");
        re = Double.parseDouble(complex[0]);
        im = Double.parseDouble(complex[1]);
        numTwo = new Complex(re, im);
    }

    public CalculatorComplex(Complex num, String in) {
        numOne = num;
        char[] chars = in.toCharArray();
        StringBuilder temp = new StringBuilder();
        double re;
        double im;
        for (char ch : chars) {
            if (ch == '/' || ch == '*' || ch == '+' || ch == '-') {
                operation = ch;
                temp = new StringBuilder();
            } else temp.append(ch);
        }
        String[] complex = temp.toString().strip().split(" ");
        re = Double.parseDouble(complex[0]);
        im = Double.parseDouble(complex[1]);
        numTwo = new Complex(re, im);
    }

    public char getOperation() {
        return operation;
    }

    public Complex getNumOne() {
        return numOne;
    }

    public Complex getNumTwo() {
        return numTwo;
    }

    @Override
    public String toString() {
        return numOne + " " + operation + " " + numTwo;
    }
}