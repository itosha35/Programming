package data;

public record Complex(double re, double im) {

    public String toString() {
        if (im == 0) return re + "";
        if (re == 0) return im + "i";
        if (im < 0) return re + "-" + (-im) + "i";
        return re + "+" + im + "i";
    }
}