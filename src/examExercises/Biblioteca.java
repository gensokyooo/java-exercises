package examExercises;

import java.util.Set;
import java.util.HashSet;

public class Biblioteca implements Comparable <Biblioteca> {

    private Set <ElementoBibliografico> elementi_disponibili;
    private Set <ElementoBibliografico> elementi_prestati;


    public Biblioteca () {
        this.elementi_disponibili = new HashSet<>();
        this.elementi_prestati = new HashSet<>();
    }

    void add (ElementoBibliografico x) {
        elementi_disponibili.add(x);
    }

    void presta (ElementoBibliografico x) throws BibliotecaException {
        if (!(elementi_disponibili.contains(x))) {
            throw new BibliotecaException ("Element not available");
        }
        elementi_disponibili.remove(x);
        elementi_prestati.add(x);
    }

    void restituisci (ElementoBibliografico x) throws BibliotecaException {
        if (!(elementi_prestati.contains(x))) {
            throw new BibliotecaException ("Element not found in the archive");
        }
        elementi_prestati.remove(x);
        elementi_disponibili.add(x);
    }

    @Override
    public int compareTo (Biblioteca x) {
        return Integer.compare(this.elementi_disponibili.size(), x.elementi_disponibili.size());
    }

}
