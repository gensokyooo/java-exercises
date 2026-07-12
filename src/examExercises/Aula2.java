package examExercises;

public abstract class Aula2 implements Comparable <Aula2> {
    private String nome;
    private int capacity;

    public String getNome () {
        return this.nome;
    }
    public int getCapacity () {
        return this.capacity;
    }
@Override
public int compareTo (Aula2 other) {
    return Integer.compare (this.getCapacity(), other.getCapacity());
    }

    @Override
    public boolean equals (Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Aula2)) return false;

        Aula2 other = (Aula2) obj;

        boolean sameName = this.nome.equals(other.nome);
        boolean sameCapacity = this.capacity == other.capacity;

        return sameName && sameCapacity;
    }
}
