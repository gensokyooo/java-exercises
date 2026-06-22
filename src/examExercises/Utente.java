package examExercises;

public class Utente {
    private String name;
    private String lastname;

    public Utente (String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName () {
        return this.name;
    }

    public String getLastname () {
        return this.lastname;
    }
    @Override
    public boolean equals (Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Utente)) return false;

        Utente other = (Utente) obj;

        boolean sameName = this.getName().equals(other.getName());
        boolean sameLastName = this.getLastname().equals(other.getLastname());

        return sameName && sameLastName;
    }

    @Override
    public String toString() {
        return "Name" + this.getName() + "Last name: " + this.getLastname();
    }
}
