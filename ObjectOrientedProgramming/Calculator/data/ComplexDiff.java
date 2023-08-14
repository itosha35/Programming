package data;

public class ComplexDiff implements Operations {

    public Complex getExecute(Complex a, Complex b) {
        double real = a.re() - b.re();
        double img = a.im() - b.im();
        return new Complex(real, img);
    }
}