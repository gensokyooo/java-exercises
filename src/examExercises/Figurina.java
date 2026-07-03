package examExercises;

public abstract class Figurina implements Comparable<Figurina>  {
    private int id;

    public Figurina (int id) {
        if (id < 0) {
            throw new IllegalArgumentException ("id must be positive");
        }
        this.id = id;
    }
    public int getId () {
        return id;
    }

    @Override
    public boolean equals (Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Figurina)) return false;

        Figurina other = (Figurina) obj;

        boolean sameId = this.id == other.getId();

        return sameId;

    }
}
