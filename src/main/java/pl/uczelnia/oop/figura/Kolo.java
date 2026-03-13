package main.java.pl.uczelnia.oop.figura;

public class Kolo extends Figura {
    private double r;

    public Kolo(double r) {
        this.r = r;
    }

    @Override
    public double obliczPole() {
        return r*r*3.1415;
    }
}
