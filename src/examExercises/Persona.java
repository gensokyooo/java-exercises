package examExercises;

import java.util.Set;
import java.util.HashSet;


public class Persona {
    private String nome;
    private String cognome;
    private Set <MetodoPagamento> metodi;

    public Persona (String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.metodi = new HashSet<>();
    }

    public void aggiungiMetodoDiPagamento (MetodoPagamento x) {
        metodi.add(x);
    }

    public void paga (MetodoPagamento m, double importo) {
        if (metodi.contains(m)) {
            m.decrementa(importo);
        }
    }
}
