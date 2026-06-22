package examExercises;

public abstract class Aula {
private String nome;
private int capienza;

public String getNome () {
    return nome;
}
public int getCapienza () {
    return capienza;
}
    public Aula (String nome, int capienza) {
    this.nome = nome;
    this.capienza = capienza;
    }

@Override
    public boolean equals (Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (!(obj instanceof Aula)) return false;

    // Treat obj as an aula instance
    Aula other = (Aula) obj;

    boolean sameName = this.getNome().equals(other.getNome());
    boolean sameCapienza = this.getCapienza() == other.getCapienza();

    return sameName && sameCapienza;
    }
}
