package cz.czechitas.ukol4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Třída pro losování Sportky.
 */
public class Sportka {
    private final List<Integer> osudi = new ArrayList<>();

    public Sportka() {
        //TODO naplnit osudí čísly 1 až 49.
              for (int i = 0; i <49; i++) {
            osudi.add(1+i);

        }

    }

    /**
     * Zamíchá osudí.
     *
     * @see Collections#shuffle(List)
     */
    public void zamichej() {
        //TODO zamíchat osudí
        //osudi.shuffle();
        Collections.shuffle(osudi);
    }

    /**
     * Vrátí seznam s 6 vylosovanými čísly.
     *
     * @return Seznam vylosovaných čísel.
     * @see List#subList(int, int)
     */
    public List<Integer> dejVylosovanaCisla() {
        //TODO Vrátit seznam prvních 6 čísel z osudí.
        return osudi.subList(0,6);

    }

    /**
     * Vrátí sedmé vylosované číslo (dodatkové číslo)
     *
     * @return Dodatkové číslo.
     */
    public Integer dejDodatkoveCislo() {
        //TODO Vrátit sedmé číslo z osudí.
        return osudi.get(6);
    }
}
