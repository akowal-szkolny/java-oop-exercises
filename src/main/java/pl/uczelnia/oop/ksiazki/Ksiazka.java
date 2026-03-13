package main.java.pl.uczelnia.oop.ksiazki;

public class Ksiazka {
    private String tytul, autor;
    private int strony;
    private float cena;

    public Ksiazka(String tytul, String autor, int strony, float cena){
        this.tytul = tytul;
        this.autor = autor;
        this.strony = strony;
        this.cena = cena;
    }
    public double obliczCeneZaStrone(){
        return cena/(double)strony;
    }

    public int getStrony() {
        return strony;
    }

    public void wyswietlInformacje() {
        System.out.println("Ksiazka{" +
                "tytul='" + tytul + '\'' +
                ", autor='" + autor + '\'' +
                ", strony=" + strony +
                ", cena=" + cena +
                '}');
    }
}