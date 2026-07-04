package examExercises;

public class StudenteOrdinario implements Immatricolabile{
    private String matricola;
    private String nome_scuola;

    public StudenteOrdinario (String matricola, String nome_scuola) {
        this.matricola = matricola;
        this.nome_scuola = nome_scuola;
    }

    @Override
    public String getMatricola () {
        return this.matricola;
    }

    @Override
    public boolean equals (Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof StudenteOrdinario)) return false;

        StudenteOrdinario other = (StudenteOrdinario) obj;

        return this.matricola.equals(other.matricola);

    }

}
