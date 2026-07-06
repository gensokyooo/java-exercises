package examExercises;

public class Studente {
    private String nome;
    private String cognome;
    private int matricola;


    public Studente (String nome, String cognome, int matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }

    @Override
    public String toString () {
        return "Nome: " + nome + "Cognome: " + cognome + "Matricola: " + matricola ;
    }

    @Override
    public boolean equals (Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Studente)) return false;

        Studente other = (Studente) obj;

        return this.matricola == other.matricola;
    }


}
