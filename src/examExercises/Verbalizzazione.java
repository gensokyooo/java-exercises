package examExercises;

public class Verbalizzazione {
    private final Studente studente;
    private final int esito;

    public Verbalizzazione(Studente studente, int esito) {
        this.studente = studente;
        if (esito < 0 || esito > 30) throw new RuntimeException();
        this.esito = esito;
    }

    public Studente getStudente() {
        return studente;
    }

    public int getEsito() {
        return esito;
    }
}