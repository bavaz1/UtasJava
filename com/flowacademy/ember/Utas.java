package com.flowacademy.ember;

public class Utas extends Ember {
    /*Hozzunk létre egy Utas osztály, amely az Ember osztályból származik, és egy tömegközlekedési eszközön utazó embert valósít meg.
    Bővítsük az ősosztályt a következő adattagokkal: jegyek száma (pl.: 3), bérletes-e (megadja, hogy az adott utasnak van-e bérlete,
    pl.: true), érvényesített-e (megadja, hogy van-e az utasnál érvényesített menetjegy, pl.: false).
    Ezek az adattagok is rendelkezzenek getter() - setter() metódusokkal. Legyen olyan konsruktora az Utas osztálynak,
    amely a név és az életkor mellett a jegyek számát, és a bérletet (true/false) kapja paraméterül, és ezek alapján inicializálja
    az adattagokat. Ne feledkezzünk meg az érvényesítette-e adattagról sem, amely alapértelmezetten hamis értéket kell tároljon.
    Használjuk az ősosztály konstruktorát. Definiáljuk felül a toString() metódust úgy, hogy az új adattagok is kiírásra kerüljenek.
    Készítsünk felszall() metódsut, amely felszáll egy járműre. Ez azzal jár, hogy, ha nincs bérlete az utasnak, érvényesítenie
    kell a jegyét. Amennyiben nincs már jegye, akkor is felszáll a járműre, de ezzel kockáztatja, hogy megbüntetik.
    Írassuk ki, hogy mi történt az utassal a felszálláskor. (Pl.: Felszalltam, de nincs berletem, és mar jegyem sincs,
    ezert lehet megbuntetnek.)*/

    private int jegyekszama;
    private boolean berletes;
    private boolean ervenyesMenetjegy = false;

    public Utas(String nev, int eletkor, int jegyekszama, boolean berletes) {
        super(nev, eletkor);
        this.jegyekszama = jegyekszama;
        this.berletes = berletes;
    }

    public void felszall() {
        if (berletes == true) {
            System.out.println("Felszálltam, de mivel van bérletem, semmi para.");
        } else {
            if (jegyekszama > 0) {
                ervenyesMenetjegy = true;
                jegyekszama--;
                System.out.println("Felszálltam, de érvényesítenem kellett egy jegyet, mert nincs bérletem.");
            } else {
                System.out.println("Felszálltam, de nincs bérletem, és mar jegyem sincs, ezért lehet megbüntetnek.");
            }
        }
    }

    public int getJegyekszama() {
        return jegyekszama;
    }

    public void setJegyekszama(int jegyekszama) {
        this.jegyekszama = jegyekszama;
    }

    public boolean isBerletes() {
        return berletes;
    }

    public void setBerletes(boolean berletes) {
        this.berletes = berletes;
    }

    public boolean isErvenyesMenetjegy() {
        return ervenyesMenetjegy;
    }

    public void setErvenyesMenetjegy(boolean ervenyesMenetjegy) {
        this.ervenyesMenetjegy = ervenyesMenetjegy;
    }


    @Override
    public String toString() {
        return "[név: " + getNev() +
                "; életkor: " + getEletkor() +
                "; jegyek száma: " + jegyekszama +
                ((berletes == true) ? "; bérlettel rendelkezik" : "; nem rendelkezik bérlettel") +
                ((ervenyesMenetjegy == true) ? "; érvényes menetjegye van" : "; nincs érvényes menetjegye") +
                ']';
    }
}
