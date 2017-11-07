import com.flowacademy.ember.*;

import java.util.ArrayList;
import java.util.List;

public class UtasMain {
    public static void main(String[] args) {
        /*Készítsünk egy UtasMain futtatható osztályt, amely nincs benne az ember csomagban.
        Parancssori paraméterként kapja meg az Utasokat a következő formában:
        név életkor jegyek_száma bérletes-e ...
        A bérletes-e helyén az „igen” vagy a „nem” szavak szerepelhetnek.
        Hozzuk létre a parancssori paraméterek alapján az Utasokat, majd mindenki szálljon fel a járműre
        (hívjuk meg a felszáll metódusaikat). Ezt követően hozzunk létre egy Ellenőrt is, aki minden Utast ellenőrizzen.*/

        List<Utas> utasok = new ArrayList<Utas>();
        boolean berletesE;

        if (args.length % 5 == 0) {
            for (int i = 0; i < args.length; i++) {
                if (i % 5 == 0) {
                    if (args[i + 4].equals("igen")) {
                        berletesE = true;
                    } else {
                        berletesE = false;
                    }
                    Utas utas = new Utas(args[i] + " " + args[i + 1], Integer.parseInt(args[i + 2]),
                            Integer.parseInt(args[i + 3]), berletesE);
                    utasok.add(utas);
                }
            }

            for (int i = 0; i < utasok.size(); i++) {
                utasok.get(i).felszall();
            }

            Ellenor ellenor = new Ellenor("Jozsi", 53);

            for (int i = 0; i < utasok.size(); i++) {
                ellenor.ellenoriz(utasok.get(i));
            }
        } else {
            System.out.println("Az utasok adatai nem helyesen vannak tagolva.");
        }
    }
}
