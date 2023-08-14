package data;

public class ComplexDiv implements Operations {

    public Complex getExecute(Complex a, Complex b) {
        double real = (a.re() * b.re() + a.im() + b.im()) / (a.re() * a.re() + a.im() + a.im());
        double img =  (b.im() * a.re() - b.re() * a.im()) / (a.re() * a.re() + a.im() + a.im());
        return new Complex(real, img);
    }
}