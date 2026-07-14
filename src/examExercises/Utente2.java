package examExercises;

public class Utente2 {

    private String nome;
    private String cognome;

    public Utente2(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Utente2)) return false;

        Utente2 other = (Utente2) obj;

        boolean sameName = this.nome.equals(other.nome);
        boolean sameLastName = this.cognome.equals(other.cognome);

        return sameName && sameLastName;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "Cognome: " + this.cognome;
    }


    public static void main(String[] args) {

        Utente2 mario = new Utente2("Mario", "Rossi");
    }
}



