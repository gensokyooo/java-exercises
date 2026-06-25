package examExercises;

public abstract class Partecipante {
    private String nome;
    private int anni_attivita;

   public Partecipante (String nome, int anni_attivita) {
        this.nome = nome;
        this.anni_attivita = anni_attivita;
    }
    public String getNome () {
       return nome;
    }
    public int getAnni_attivita () {
       return anni_attivita;
    }

    @Override
    public boolean equals (Object obj) {
       if (this == obj) return true;
       if (obj == null) return false;
       if (!(obj instanceof Partecipante)) return false;

       Partecipante other = (Partecipante) obj;

       boolean stessoNome = this.getNome().equals(other.getNome());
       boolean stessiAnniAttivita = this.getAnni_attivita() == other.getAnni_attivita();

       return stessoNome && stessiAnniAttivita;
    }
}
