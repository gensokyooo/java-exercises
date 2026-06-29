package examExercises;

public class Band extends Partecipante{
    private int numeroComponenti;
    public Band (String nome, int anni_attivita, int numeroComponenti) {
        super (nome,anni_attivita);
        this.numeroComponenti = numeroComponenti;
    }

    public int getNumeroComponenti () {
        return numeroComponenti;
    }

    @Override
    public boolean equals (Object obj) {
        if (!(obj instanceof Band)) return false;
        Band other = (Band) obj;
        boolean stessiComponenti = this.getNumeroComponenti() == other.getNumeroComponenti();
        return super.equals(obj) && stessiComponenti;
    }
}
