package examExercises;

public class Partito implements Eleggibile{
    private String nome;
    private int voti;

    public Partito (String nome) {
        this.nome = nome;
        voti = 0;
    }

    @Override
    public String getNome () {
        return nome;
    }
    @Override
    public int getVoti () {
        return voti;
    }

    public void vota () {
        voti++;
    }

    @Override
    public boolean equals (Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Partito)) return false;
        Partito other = (Partito) obj;
        boolean sameName = this.getNome().equals(other.getNome());
        boolean sameVoti = this.getVoti() == other.getVoti();

        return sameName && sameVoti;
    }

    @Override
    public String toString () {
        return "Nome: " + nome + "Numero di voti: " + voti;
    }

}
