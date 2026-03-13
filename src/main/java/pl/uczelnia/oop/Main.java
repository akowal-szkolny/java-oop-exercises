package main.java.pl.uczelnia.oop;

import main.java.pl.uczelnia.oop.ksiazki.Ksiazka;
import main.java.pl.uczelnia.oop.pracownicy.Pracownik;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("Ksiazki");
            Ksiazka[] ksiazki = new Ksiazka[5];
            ksiazki[0] = new Ksiazka("KSiazka1", "Autor1", 10, 20);
            ksiazki[1] = new Ksiazka("KSiazka2", "Autor2", 23, 65);
            ksiazki[2] = new Ksiazka("KSiazka3", "Autor3", 45, 54);
            ksiazki[3] = new Ksiazka("KSiazka4", "Autor4", 23, 234);
            ksiazki[4] = new Ksiazka("KSiazka5", "Autor5", 17, 23);
            Ksiazka maxStron = ksiazki[0];
            for (Ksiazka x : ksiazki) {
                x.wyswietlInformacje();
                if (maxStron.getStrony() < x.getStrony()) maxStron = x;
            }

            System.out.println("Max stron w ksiazce: ");
            maxStron.wyswietlInformacje();
        }
        {
            System.out.println("pracownicy");
            Pracownik[] pracownicy = new Pracownik[4];
            pracownicy[0] = new Pracownik("Janusz", "Nowak", 1000);
            pracownicy[1] = new Pracownik("Marek", "Nowakowski", 10000);
            pracownicy[2] = new Pracownik("Siemowit", "Nowakow", 100);
            pracownicy[3] = new Pracownik("Zbigniew", "Nowaczek", 10);
            int s = 0;
            for(Pracownik p : pracownicy) {
                System.out.println(p.toString());
                s+=p.getPensja();
            }
            System.out.println((s/ (double)pracownicy.length));
        }
    }
}