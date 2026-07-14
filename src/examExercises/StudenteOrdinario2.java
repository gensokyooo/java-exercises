package examExercises;

public class StudenteOrdinario2 implements Immatricolabile2 {

    private int matricola;
    private String nome_scuola;

    @Override
    public boolean equals (Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof StudenteOrdinario2)) return false;

        StudenteOrdinario2 other = (StudenteOrdinario2) obj;

        return this.matricola == other.matricola;
    }

}
