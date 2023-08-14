package data;

public class ComplexMulti implements Operations {

    public Complex getExecute(Complex a, Complex b) {
        double real = a.re() * b.re() - a.im() * b.im();
        double img = a.re() * b.im() + a.im() * b.re();
        return new Complex(real, img);
    }
}