package com.flowacademy.ember;

public class Ember {
    /*Készítsünk egy Ember osztályt, melyben az emberekről eltároljuk: a nevüket és az életkorukat.
    Az adattagokat ne lehessen más osztályból elérni és rendelkezzenek beállító és lekérdező függvényekkel,
    valamint hozzunk létre olyan kostruktort, amely két paramétert vár,
    és ezeknek megfelelően inicializálja az adattagok értékét.
    Továbbá készítsünk toString() metódust is az osztályhoz,
    amely kiírja az adattagjai értékét a következő formában: [név: Kis János; életkor: 23]*/

    private String nev;
    private int eletkor;

    public Ember(String nev, int eletkor) {
        this.nev = nev;
        this.eletkor = eletkor;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getEletkor() {
        return eletkor;
    }

    public void setEletkor(int eletkor) {
        this.eletkor = eletkor;
    }

    @Override
    public String toString() {
        return "[név: " + nev +
                "; életkor: " + eletkor +
                ']';
    }
}
