package main.java.pl.uczelnia.oop.figura;

public class Prostokat extends Figura {
    private double a,b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double obliczPole() {
        return a*b;
    }
}
