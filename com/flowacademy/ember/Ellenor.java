package com.flowacademy.ember;

public class Ellenor extends Ember {
    /*Készítsünk egy Ellenőr osztályt, amely szintén az Ember osztályból származik.
    Bővítsük az ősosztályt egy olyan adattaggal, amely az eddig megbüntetett utasok számát tárolja.
    Az új adattaghoz is hozzuk létre geter() - setter() metódusokat.
    Legyen egy olyan konstruktora az osztálynak, amely ugyanazokat a paramétereket várja,
    mint az ősosztály konstuktora, és ezek alpján állítja be a név és az életkor értékeket.
    Ehhez használjuk az ősosztály konstruktorát. Ne feledkezzünk meg az új adattagról sem.
    Írjunk egy ellenoriz() metódust, amely egy Utast vár pataméterül, és megnézi,
    hogy az adott Utasnak, van-e bérlete, ha nincs akkor ellenorzi, hogy van-e érvényesített jegye,
    ha az sincs, akkor büntesse meg: írja ki, hogy az adott Utast megbüntette 5000 Ft-tal,
    ehhez használja az Utas osztály toString() metódusát. Emellett növelje 1-gyel a megbüntetett utasok számát.*/

    private int megbuntetettUtasokSzama = 0;

    public Ellenor(String nev, int eletkor) {
        super(nev, eletkor);
    }

    public void ellenoriz(Utas utas) {
        if (utas.isBerletes() != true) {
            if (utas.isErvenyesMenetjegy() != true) {
                System.out.println(utas.toString() + " megbüntettem 5000 Ft-tal.");
                megbuntetettUtasokSzama++;
            }
        }
    }

    public int getMegbuntetettUtasokSzama() {
        return megbuntetettUtasokSzama;
    }

    public void setMegbuntetettUtasokSzama(int megbuntetettUtasokSzama) {
        this.megbuntetettUtasokSzama = megbuntetettUtasokSzama;
    }

}
