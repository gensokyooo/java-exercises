package examExercises;

import java.util.ArrayList;

public class Esame {

    private ArrayList <Studente> iscritti;
    private ArrayList <Verbalizzazione> verbalizzazione;

    public Esame () {
        this.iscritti = new ArrayList<>();
        this.verbalizzazione = new ArrayList<>();

    }

    void iscrivi (Studente x) throws StudenteGiaIscrittoException {
        boolean found = false;
        for (int i = 0; i < iscritti.size(); i++) {
            if (x.equals(iscritti.get(i))) {
               found = true;
            }
            if (found) {
                throw new StudenteGiaIscrittoException("Student already subbed");
            }

        }

        iscritti.add(x);

    }

    void verbalizza (Studente x, int grade) throws StudenteNonIscrittoException, StudenteGiaVerbalizzatoException  {
        boolean found = false;
        for (int i = 0; i < iscritti.size(); i++) {
            if (x.equals(iscritti.get(i))) {
                found = true;
                break;
            }

        }
        if (!found) {
            throw new StudenteNonIscrittoException("Student not subbed");
        }

        for (int i = 0; i < verbalizzazione.size(); i++) {

        }



    }




}
