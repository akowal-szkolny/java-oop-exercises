package main.java.pl.uczelnia.oop.pracownicy;

public class Pracownik {
    private String imie,nazwisko;
    private int pensja;

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getPensja() {
        return pensja;
    }

    public void setPensja(int pensja) {
        this.pensja = pensja;
        if(this.pensja<0) this.pensja = 0;
    }
}
